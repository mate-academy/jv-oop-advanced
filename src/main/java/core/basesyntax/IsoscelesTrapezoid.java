package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double side;

    IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double side) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.side = side;
    }

    @Override
    public double getArea() {
        double height = 0.5 * Math.sqrt(4 * side * side - Math.pow(lowerBase - upperBase, 2));
        return 0.5 * height * lowerBase;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: isosceles trapezoid, area: %.2f sq.units, "
                        + "upper base: %.2f, lower base: %.2f, side: %.2f, color: %s%n",
                this.getArea(), upperBase, lowerBase, side, this.getColor());
    }
}
