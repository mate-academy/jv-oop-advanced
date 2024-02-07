package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(String color, int baseSide, int topSide, int height) {
        super(color);
        this.height = height;
        this.topSide = topSide;
        this.baseSide = baseSide;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (baseSide + topSide) * height;
    }

    @Override
    public void drawTheFigure() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq.units,"
                        + " baseSide: %d units, topSide: %d units, height: %d units, color: %s%n",
                calculateArea(), baseSide, topSide, height, getColor().toLowerCase());
    }
}
