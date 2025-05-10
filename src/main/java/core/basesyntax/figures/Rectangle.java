package core.basesyntax.figures;

import core.basesyntax.Color;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.unit, length: "
                + length + " units, width: " + width
                + " units, color: " + getColor().name());
    }
}
