package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String name, String color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.2f sq.units,"
                + "firstLeg: %d units, secondLeg: %d units,"
                + "color: %s", getName(), getArea(), firstLeg, secondLeg, getColor());
    }
}
