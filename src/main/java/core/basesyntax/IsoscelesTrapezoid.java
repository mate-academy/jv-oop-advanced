package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double a, b, c;
    public IsoscelesTrapezoid(double a, double b, double c, Colors color) {//a,b - trapezoid base; c - lateral trapezoid;
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        return (a + b) * Math.sqrt(Math.pow(c, 2) - Math.pow(a - b, 2) / 4) / 2;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
