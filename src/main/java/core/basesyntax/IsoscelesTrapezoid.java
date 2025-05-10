package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseSide;
    private double equalSides;
    private double topSide;

    public IsoscelesTrapezoid(double baseSide, double equalSides, double topSide, String color) {
        this.baseSide = baseSide;
        this.equalSides = equalSides;
        this.topSide = topSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (baseSide + topSide) / 2 * Math.sqrt(Math.pow(equalSides,2)
                - Math.pow((baseSide - topSide) / 2,2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.2f", getArea()) + " sq.units "
                + "baseSide: " + String.format("%.2f", baseSide)
                + " units, equalSides: " + String.format("%.2f", equalSides)
                + " units, topSide: " + String.format("%.2f", topSide)
                + " units, color: " + color);
    }
}
