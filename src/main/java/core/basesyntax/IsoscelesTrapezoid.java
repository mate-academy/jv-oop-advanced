package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double lowerSide;
    private final double upperSide;
    private final double height;

    public IsoscelesTrapezoid(double lowerSide, double upperSide, double height, String color) {
        super(color);
        this.lowerSide = lowerSide;
        this.upperSide = upperSide;
        this.height = height;
    }

    @Override
    public String drawFigure() {
        return String.format("Figure:%s, area: %.2f sq.units, lowerSide: %.2f units,"
                        + " upperSide: %.2f units, height: %.2f units, color: %s",
                IsoscelesTrapezoid.class.getSimpleName()
                        .replaceAll("([A-Z])", " $1").toLowerCase(),
                getArea(), lowerSide, upperSide, height, getColor());
    }

    @Override
    public double getArea() {
        return ((lowerSide + upperSide) / 2) * height;
    }
}
