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
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public String draw() {
        return String.format(Pen.TEMPLATE, FigureName.RIGHT_TRIANGLE.name().toLowerCase(),
                getArea(),
                String.format("firstLeg: %d units, secondLeg: %d units", firstLeg, secondLeg),
                getColor());
    }
}
