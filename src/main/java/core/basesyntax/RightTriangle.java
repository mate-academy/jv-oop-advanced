package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg1;
    private double leg2;

    RightTriangle(String color, double leg1, double leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public double getArea() {
        return 0.5 * leg1 * leg2;
    }

    public String draw() {
        return "\n" + "Right triangle - " + getColor()
                + "\n" + "first leg: " + leg1
                + "\n" + "second leg: " + leg2
                + "\n" + "area: " + getArea();
    }
}
