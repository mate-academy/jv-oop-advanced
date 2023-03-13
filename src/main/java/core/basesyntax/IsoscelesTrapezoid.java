package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int topSide;
    private final int bottomSide;

    public IsoscelesTrapezoid(String color, int height, int topSide, int bottomSide) {
        super(color);
        this.height = height;
        this.topSide = topSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "height: " + height + " units, topSide: " + topSide + " units, "
                + "bottomSide: " + bottomSide + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) / 2.0) * height;
    }
}
