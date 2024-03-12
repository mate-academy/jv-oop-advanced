package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg * 0.5;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: right triangle, area: " + String.format("%.2f", getArea())
                + " sq. units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor().name().toLowerCase();
    }
}
