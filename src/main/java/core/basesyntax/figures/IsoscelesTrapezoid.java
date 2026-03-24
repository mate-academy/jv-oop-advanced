package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + String.format("%.1f",getArea())
                        + " sq. units, upperBase: " + String.format("%.1f",upperBase)
                        + " units, lowerBase: " + String.format("%.1f",lowerBase)
                        + " units, height: " + String.format("%.1f",height)
                        + " units, color: " + getColor()
        );
    }
}