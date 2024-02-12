package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(Color color, int baseSide, int topSide, int height) {
        super(color);
        this.baseSide = baseSide;
        this.topSide = topSide;
        this.height = height;
        setArea(calculateArea());
    }

    @Override
    public String draw() {
        return "Figure: isoscelesTrapezoid, area: " + getArea() + " sq. units,"
                + " baseSide: " + baseSide + " units,"
                + " topSide: " + topSide + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor();
    }

    @Override
    public double calculateArea() {
        return (double) (baseSide + topSide) / 2 * height;
    }
}
