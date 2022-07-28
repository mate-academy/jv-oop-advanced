package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double AREA_MULTIPLIER = 0.5;
    private double topBasis;
    private double bottomBasis;
    private double height;

    public IsoscelesTrapezoid(Color color, double topBasis, double bottomBasis, double height) {
        super(color);
        this.topBasis = topBasis;
        this.bottomBasis = bottomBasis;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (topBasis + bottomBasis) * height * AREA_MULTIPLIER;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + calculateArea() + " sq.units, topBasis: "
                + topBasis + " units, bottomBasis: "
                + bottomBasis + " units, height: "
                + height + " units, color: "
                + getColor();
    }
}
