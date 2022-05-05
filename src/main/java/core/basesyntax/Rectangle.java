package core.basesyntax;

public class Rectangle extends Figure {
    private double first;
    private double second;

    public Rectangle(Colors color, double first, double second) {
        super(color);
        this.first = first;
        this.second = second;
    }

    public double getArea() {
        return first * second;
    }

    public double getA() {
        return first;
    }

    public double getB() {
        return second;
    }
}
