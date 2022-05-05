package core.basesyntax;

public class Rectangle extends Figure {
    private double a, b;

    public Rectangle(Colors color, double a, double b) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public double getArea() {
        return a * b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Colors getColor() {
        return color;
    }
}
