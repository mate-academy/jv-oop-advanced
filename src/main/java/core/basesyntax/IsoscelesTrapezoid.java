package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBasis;
    private final double lowerBasis;
    private final double side;

    public IsoscelesTrapezoid(final String color,
                              final double upperBasis,
                              final double lowerBasis,
                              final double side) {
        super(color);
        this.upperBasis = upperBasis;
        this.lowerBasis = lowerBasis;
        this.side = side;
    }

    @Override
    public double getArea() {
        double s = (upperBasis + lowerBasis + (2 * side)) / 2;
        return Math.sqrt(
                (s - upperBasis) * (s - lowerBasis) * Math.pow((s - side), 2)
        );
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: Isosceles Trapezoid, "
                        + "area: %.1f sq.units, "
                        + "upperBasis: %.1f units,  "
                        + "lowerBasis: %.1f units,  "
                        + "side: %.1f units, "
                        + "color: %s%n",
                this.getArea(), this.upperBasis, this.lowerBasis, this.side, super.getColor()
        );
    }
}
