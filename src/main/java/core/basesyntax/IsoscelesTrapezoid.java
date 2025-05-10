package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int downSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int height, int downSide, int topSide) {
        super(color);
        this.height = height;
        this.downSide = downSide;
        this.topSide = topSide;
    }

    @Override
    public double getArea() {
        return (topSide + downSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "isosceles trapezoid, "
                + "area: "
                + getArea()
                + " sq.units, "
                + "topSide: "
                + topSide
                + " units, "
                + "downSide: "
                + downSide
                + " units, "
                + "height: "
                + height
                + " units, "
                + "color: "
                + getColor());
    }
}
