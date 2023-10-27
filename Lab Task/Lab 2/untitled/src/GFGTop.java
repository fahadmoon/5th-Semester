import java.awt.*;
import java.awt.event.*;

class GFGTop extends Frame implements ActionListener { // Added "implements ActionListener" to handle button click event
    TextField textField;
    Button button; // Declare the "button" variable

    GFGTop() {
        textField = new TextField();
        textField.setBounds(60, 50, 180, 25);

        button = new Button("Click Here");
        button.setBounds(100, 120, 80, 30);
        button.addActionListener(this);

        add(textField);
        add(button);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String text = textField.getText();
            System.out.println("Text entered: " + text);
        }
    }

    public static void main(String[] args) {
        new GFGTop();
    }
}
