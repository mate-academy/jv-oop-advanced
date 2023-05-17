package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public static final int DIVIDER_TWO = 2;
    private final double upSide;
    private final double downSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double upSide, double downSide, double height) {
        super(color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upSide + downSide) / DIVIDER_TWO * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq.units,"
                + " upSide: " + upSide
                + " downSide: " + downSide
                + " height: " + height
                + " units, color: " + getColor().toLowerCase());
    }
}
