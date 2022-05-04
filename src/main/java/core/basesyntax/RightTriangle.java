package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "right triangle, area: " + getArea()
            + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: "
            + secondLeg + " units, color: " + getColor().toLowerCase();
    }
}
