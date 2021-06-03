package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double underSide;
    private double height;

    public IsoscelesTrapezoid(String color, double upperSide, double underSide, double height) {
        super(color);
        this.upperSide = upperSide;
        this.underSide = underSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperSide + underSide) * height / 2;
    }

    @Override
    public String draw() {
        return String.format("Figure: Trapezoid, area: %.2f sq.units, "
                + "upperSide: %.3f units, underSide: %.3f units, height: %.3f units, "
                + "color: %s", getArea(), upperSide, underSide, height, getColor());
    }
}
