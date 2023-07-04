package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure : rectangle, area: "
                + calculateArea() + " sq.units,"
                + " width: " + width + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor().name().toLowerCase());
    }
}
