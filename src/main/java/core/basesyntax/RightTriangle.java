package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String getDraw() {
        return "Figure: right triangle, area: " + getArea() + ", firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg + ", color: " + getColor();
    }
}
