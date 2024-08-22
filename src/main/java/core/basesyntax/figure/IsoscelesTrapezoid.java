package core.basesyntax.figure;

import core.basesyntax.figure.Figure;

public class IsoscelesTrapezoid extends Figure {
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
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " square units, base1: "
                + topBase + " units, base2: "
                + bottomBase + " units, height: "
                + height + " units, color: "
                + getColor());
    }
}
