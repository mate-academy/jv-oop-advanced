package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBasis;
    private final double secondBasis;
    private final double height;

    public IsoscelesTrapezoid(String color, int firstBasis, int secondBasis, int height) {
        super(color);
        this.firstBasis = firstBasis;
        this.secondBasis = secondBasis;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBasis + secondBasis) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first basis: " + firstBasis
                + " sq.units, second basis: " + secondBasis
                + " sq.units, height: " + height
                + " units, color: " + getColor();
    }
}
