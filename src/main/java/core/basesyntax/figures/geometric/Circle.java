package core.basesyntax.figures.geometric;

import core.basesyntax.figures.Figure;

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
        System.out.println("Figure: circle, area: " + df.format(getArea()) + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + color.toLowerCase());
    }
}
