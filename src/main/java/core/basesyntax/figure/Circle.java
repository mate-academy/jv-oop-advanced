package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, Color color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double resultArea() {
        return (2 * Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: "
                + resultArea() + " sq.units"
                + ", radius: " + this.radius + " units, "
                + "color: " + getColor().name());
    }
}
