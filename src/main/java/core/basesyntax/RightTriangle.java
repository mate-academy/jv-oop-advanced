package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        this.firstLeg = getNumber();
        this.secondLeg = getNumber();
    }

    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: "
                + String.format("%.2f", getArea()) + " sq.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: "
                + getColor();
    }
}
