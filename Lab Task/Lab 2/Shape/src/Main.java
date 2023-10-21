class Shape {
    public double calculateArea() {
        return 0.0;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }public double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
    }
}