package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg * 2);
    }

    @Override
    public String toString() {
        return "Figure: RightTriangle, area"
                + getArea()
                + " firstLeg: "
                + firstLeg
                + ", secondLeg: "
                + secondLeg
                + ", color: "
                + color;
    }
}
