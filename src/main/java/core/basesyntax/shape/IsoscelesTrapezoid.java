package core.basesyntax.shape;

import core.basesyntax.Figure;
import core.basesyntax.Shape;

public class IsoscelesTrapezoid extends Shape implements Figure {

    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq. units, topBase: "
                + topBase + " units, bottomBase: " + bottomBase + " units, height: "
                + height + " units, color: " + color);
    }
}
