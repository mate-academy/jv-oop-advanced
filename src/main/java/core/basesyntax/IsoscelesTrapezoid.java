package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int bottomSide;
    private final int height;

    public IsoscelesTrapezoid(String name, String color, int topSide, int bottomSide, int height) {
        super(name, color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2.0 * height;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.2f sq.units, topSide: %d units,"
                + "bottomSide: %d units, height: %d units,"
                + "color: %s", getName(), getArea(), topSide, bottomSide, height, getColor());
    }
}
