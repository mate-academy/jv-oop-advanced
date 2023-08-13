package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, FigurePainter {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: right triangle, area: "
                + String.format("%.1f", getArea())
                + " sq.units, first leg: "
                + firstLeg
                + " units, second leg: "
                + secondLeg
                + ", color: "
                + getColor());
    }
}
