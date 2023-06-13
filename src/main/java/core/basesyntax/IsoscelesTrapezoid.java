package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double leg;
    private double upperSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(String color, double leg, double upperSide, double downSide, double height) {
        super(color);
        this.leg = leg;
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    double getArea() {
        return (upperSide + downSide) / 2 * height;
    }

    @Override
    void draw() {
        System.out.printf("Figure: right rectangle, area: %.2f sq.units, leg: %.2f units, upper side: %.2f units, down side: %.2f units, color: %s%n", getArea(), leg, upperSide, downSide, getColor());
    }
}
