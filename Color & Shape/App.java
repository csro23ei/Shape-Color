class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Circle Area: " + circle.getArea());

        System.out.println("\nRectangle Color: " + rectangle.getColor());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}