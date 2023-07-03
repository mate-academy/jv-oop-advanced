package core.basesyntax.model;

public class RightTriangle extends Figure {
    private static final double CONST_OF_AREA_EXPRESSION = 2;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / CONST_OF_AREA_EXPRESSION;
    }

    @Override
    public void draw() {
        System.out.println(super.getClass().getSuperclass().getName()
                + ": rightTriangle, "
                + " area: " + calculateArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units"
                + ", color: " + getColor().name());
    }
}
