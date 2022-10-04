package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double FORMULA_CONSTANT = 0.5;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
        area = getArea();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * FORMULA_CONSTANT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + area
                + " sq.units, first leg: " + firstLeg
                + " units,  second leg " + secondLeg + " units, color: " + color);
    }
}
