package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int upSide;
    private final int downSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int upSide, int downSide, int height) {
        super(color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (upSide + downSide) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Trapezoid, area: "
                + Math.floor(calculateArea()) + " sq.units, "
                + "upSide: " + upSide + " units, "
                + "downSide: " + downSide + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor());
    }
}
