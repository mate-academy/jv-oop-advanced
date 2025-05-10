package core.basesyntax.figures;

import core.basesyntax.utility.Utility;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: "
                + "circle, area: " + Utility.roundAfterPoint(getArea(), 1) + " sq. units,"
                + " radius: " + radius + " units,"
                + " color: " + getColor()
        );
    }
}
