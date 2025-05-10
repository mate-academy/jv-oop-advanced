package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, double firstLeg, double secondLeg, Color color) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this("RightTriangle", firstLeg, secondLeg, color);
    }

    @Override
    public double getArea() {
        return Math.round(0.5 * firstLeg * secondLeg * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, area: %.2f sq.units, "
                        + "first leg: %.2f units, second leg: %.2f units, color: %s",
                getName(), getArea(), firstLeg, secondLeg, getColor()));
    }
}
