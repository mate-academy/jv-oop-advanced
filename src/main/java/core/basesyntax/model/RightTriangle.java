package core.basesyntax.model;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        double area = 0.5 * firstLeg * secondLeg;
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println(super.getClass().getSuperclass().getName()
                + ": rightTriangle, "
                + " area: " + calculateArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units"
                + ", color: " + getColor());
    }
}
