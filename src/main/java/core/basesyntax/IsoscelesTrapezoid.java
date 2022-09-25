package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double legs;
    private double upperSide;
    private double lowerSide;

    public IsoscelesTrapezoid(String color, double legs, double upperSide, double lowerSide) {
        super(color);
        this.legs = legs;
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
    }

    @Override
    public double getArea() {
        return (upperSide + lowerSide) / 2
                * Math.sqrt(legs * legs - (upperSide - lowerSide) * (upperSide - lowerSide) / 4);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq.units, "
                        + "both legs: %.1f units, upperSide: %.1f units, "
                        + "lowerSide: %.1f units, color: %s\n",
                getArea(), legs, upperSide, lowerSide, getColor());
    }
}
