package core.basesyntax;

public class Square extends Figure {
    private double a;

    public Square(Colors color, double a) {
        super(color);
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }

    public double getA() {
        return a;
    }
}
