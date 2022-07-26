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
        return firstLeg * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: Right Triangle, area: " + getArea() + " sq. units, first Leg: "
                + firstLeg + " units, second Leg: " + secondLeg + " units, color: "
                + getColor();
    }

    @Override
    public String toString() {
        return draw();
    }
}
