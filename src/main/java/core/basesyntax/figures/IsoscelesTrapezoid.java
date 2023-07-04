package core.basesyntax.figures;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double smallBase;
    private double largeBase;

    public IsoscelesTrapezoid(Color color, double height, double smallBase, double largeBase) {
        super(color);
        this.height = height;
        this.smallBase = smallBase;
        this.largeBase = largeBase;
    }

    @Override
    public double getArea() {
        return height / 2 * (smallBase + largeBase);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.unit, height: " + height
                + " units, first base lengths: " + smallBase
                + " units, second base lengths: " + largeBase
                + " units, color: " + getColor().name());
    }
}
