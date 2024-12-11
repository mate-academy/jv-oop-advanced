package core.basesyntax.models;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: rectangle, area: %.1f sq. units, width: %.1f units,"
                + " height: %.1f units, color: %s\n",
                this.getArea(),
                this.width,
                this.height,
                this.getColor()
        );
    }
}
