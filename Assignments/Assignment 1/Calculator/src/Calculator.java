import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createCalculator();
        });
    }

    public static void createCalculator() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        panel.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        panel.add(buttonPanel, BorderLayout.CENTER);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if ("0123456789.".contains(command)) {
                        textField.setText(textField.getText() + command);
                    } else if ("+-*/".contains(command)) {
                        textField.setText(textField.getText() + " " + command + " ");
                    } else if ("=".equals(command)) {
                        try {
                            String expression = textField.getText();
                            double result = evaluateExpression(expression);
                            textField.setText(Double.toString(result));
                        } catch (Exception ex) {
                            textField.setText("Error");
                        }
                    }
                }
            });
        }

        frame.setVisible(true);
    }

    public static double evaluateExpression(String expression) {
        String[] parts = expression.split(" ");
        double num1 = Double.parseDouble(parts[0]);
        double num2 = Double.parseDouble(parts[2]);
        String operator = parts[1];
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
