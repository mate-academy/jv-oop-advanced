package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg1;
    private double leg2;

    public RightTriangle(String color, double leg1, double leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: righttriangle, area: " + getArea()
                + " sq.units, leg1: " + this.leg1
                + " units, leg2: " + this.leg2
                + " units, color: " + this.color);
    }
}
