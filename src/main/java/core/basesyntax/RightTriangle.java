package core.basesyntax;

public class RightTriangle extends Figure {

    private int firstLeg;
    private int secondLeg;
    private String color;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double area() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public String canDraw() {
        return String.format("Figure: right triangle, area: %.2f sq.units, firstLeg: %d units, "
                        + "secondLeg: %d units, color: %s",
                firstLeg * secondLeg * 0.5, firstLeg, secondLeg, color);
    }
}
