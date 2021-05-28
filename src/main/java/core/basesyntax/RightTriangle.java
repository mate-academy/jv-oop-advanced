package core.basesyntax;

public class RightTriangle extends Figure {

    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public String toString() {
        return "RightTriangle{"
                + "area="
                + getArea()
                + " sq.units"
                + ", firstLeg="
                + firstLeg
                + " units"
                + ", secondLeg="
                + secondLeg
                + " units"
                + ", color='"
                + color
                + '\''
                + '}';
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
