package core.basesyntax.figures;

import core.basesyntax.util.Color;

public class Circle extends Figure {

    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + calculateArea()
                + " sq. units, " + "radius: " + radius + " units, color: " + getColor());
    }
}
