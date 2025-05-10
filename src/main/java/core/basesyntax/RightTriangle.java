package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: triangle, area: %.1f sq.units,"
                + " firstLeg: %d units, secondLeg: %d units, color: %s",
                getArea(), firstLeg, secondLeg, getColor()));
    }
}
