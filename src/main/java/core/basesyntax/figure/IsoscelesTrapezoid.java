package core.basesyntax.figure;

import core.basesyntax.template.Figure;

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

    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, top base: " + topBase + " units, bottom base: " + bottomBase + " units, height: " + height + " units, color: " + getColor());
    }
}
