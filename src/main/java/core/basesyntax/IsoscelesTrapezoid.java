package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upperBasis;
    private int lowerBasis;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int height, int upperBasis, int lowerBasis) {
        this.height = height;
        this.upperBasis = upperBasis;
        this.lowerBasis = lowerBasis;
    }

    @Override
    public double getArea() {
        return (double) (lowerBasis + upperBasis) * height / 2;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq.units, height: "
                + height + "  units, lowerBasis " + lowerBasis + "  units, upperBasis "
                + upperBasis + "  units, color: " + super.getColor());
    }

}
