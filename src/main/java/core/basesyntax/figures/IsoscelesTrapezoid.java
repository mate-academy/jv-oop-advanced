package core.basesyntax.figures;

import core.basesyntax.base.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double topBase;
    private final double bottomBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double topBase,
                              double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double area() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + area()
                + " sq. units, top base: " + topBase + " units,"
                + " bottom base: " + bottomBase
                + " units, " + "height: " + height + " units,  color: " + color);
    }
}
