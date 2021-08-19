package core.basesyntax;

public class RightTriangle extends Figure {
    private double legAB;
    private double legC;

    public RightTriangle(double legAB, double legC, String color) {
        super("RightTriangle", color);
        this.legAB = legAB;
        this.legC = legC;
    }

    @Override
    public double getArea() {
        return legAB * legAB / 2;
    }

    @Override
    public void displayInfo() {
        System.out.println("Figure: right triangle"
                + ", area: " + getArea() + " sq.units"
                + ", first base length: " + legAB
                + ", second base length: " + legC
                + ", color: " + super.getColor());
    }
}
