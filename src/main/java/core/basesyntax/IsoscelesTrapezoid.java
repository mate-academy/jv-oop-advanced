package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topSide;
    private final double bottomSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (topSide + bottomSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: isosceles trapezoid, area: %.3f sq.units, "
                        + "topSide: %s units, " + "bottomSide: %s units, height: %s units, "
                        + "color: %s",
                calculateArea(), topSide, bottomSide, height, color));
    }
}
