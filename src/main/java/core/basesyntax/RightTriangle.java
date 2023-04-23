package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String printFigure() {
        return "Figure: right triangle, area: " + String.format("%.1f", getArea())
                + " firstLeg: " + firstLeg
                + " secondLeg: " + secondLeg
                + " color: " + getColor();
    }
}
