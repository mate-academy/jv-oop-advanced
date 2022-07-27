package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: " + this.getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: "
                + super.getColor();
    }

    @Override
    public Double getArea() {
        return (double)firstLeg * secondLeg / 2;
    }
}
