package core.basesyntax;

public class Square extends Figure {
    private double a;

    public Square(Colors color, double a) {
        this.color = color;
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }

    public Colors getColor() {
        return color;
    }

    public double getA() {
        return a;
    }
}
