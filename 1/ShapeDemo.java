abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    double getPerimeter() {
        return a + b + c;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape r = new Rectangle(4, 5);
        Shape c = new Circle(3);
        Shape t = new Triangle(3, 4, 5);
        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Triangle perimeter: " + t.getPerimeter());
    }
}
