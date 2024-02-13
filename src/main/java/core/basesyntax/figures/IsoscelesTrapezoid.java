package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final double upperSide;
    private final double lowerSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperSide, double lowerSide, double height) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
    }

    @Override
    public void draw(Figure trapezoid) {
        System.out.println("Figure: rectangle, area: " + getArea(trapezoid) + " sq. units, "
                + "first side: " + upperSide + " units, "
                + "second side: " + lowerSide + " units, "
                + "color: " + trapezoid.color);
    }

    @Override
    public double getArea(Figure figure) {
        return (upperSide + lowerSide) / 2 * height;
    }
}
