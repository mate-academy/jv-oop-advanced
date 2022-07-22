package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return firstLeg * firstLeg * secondLeg;
    }

    @Override
    public String draws() {
        return "Figure: Right Triangle, area: " + getArea() + " sq. units, first Leg: "
                + firstLeg + " units, second Leg: " + secondLeg + " units, color: "
                + new ColorSupplier().getRandomColor();
    }

    @Override
    public String toString() {
        return draws();
    }
}
