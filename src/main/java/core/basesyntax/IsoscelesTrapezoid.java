package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(double topSide, double bottomSide, double height, String color) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topSide + bottomSide) * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " sq. units, upperBase: "
                + topSide + " units, lowerBase: " + bottomSide + " units, height: " + height
                + " units, color: " + color;
    }
}
