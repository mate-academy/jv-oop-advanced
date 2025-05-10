package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBaseSide;
    private double upperBaseSide;
    private double height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(double lowerBaseSide, double upperBaseSide, double height) {
        this.lowerBaseSide = lowerBaseSide;
        this.upperBaseSide = upperBaseSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (lowerBaseSide + upperBaseSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq.units, lowerBaseSide: " + lowerBaseSide + " units, upperBaseSide: "
                + upperBaseSide + " units, height: " + height + " units, color: " + getColor());
    }
}
