package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %s sq.units, "
                + "firstLeg: %s units, secondLeg: %s units, color: %s%n",
                getArea(), firstLeg, secondLeg, getColor()
        );
    }
}
