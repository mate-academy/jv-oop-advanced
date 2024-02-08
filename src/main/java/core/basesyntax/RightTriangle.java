package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: right triangle, area: %.3f sq.units, first leg: "
                        + "%s units, second leg: %s units, color: %s",
                calculateArea(), firstLeg, secondLeg, color));
    }
}
