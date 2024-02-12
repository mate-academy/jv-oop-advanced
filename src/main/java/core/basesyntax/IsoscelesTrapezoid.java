package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double lowerSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double upperSide, double lowerSide, double height) {
        super("isosceles trapezoid", color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperSide + lowerSide) * height / 2;
    }

    @Override
    public String draw() {
        return super.draw() + "upperSide: " + upperSide + " units, lowerSide: " + lowerSide + " units, height: " + height + " units";
    }
}
