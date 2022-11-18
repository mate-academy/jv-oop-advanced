package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstSide;
    private final double secondSide;
    private final double height;

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, height: "
                + height + " units, color: "
                + getColor();
    }
}
