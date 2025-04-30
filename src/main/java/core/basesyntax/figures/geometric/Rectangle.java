package core.basesyntax.figures.geometric;

import core.basesyntax.figures.Figure;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
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
        System.out.println("Figure: rectangle, area " + df.format(getArea()) + " sq. units, "
                + "width: " + width + " units, "
                + "height: " + height + " units, "
                + "color: " + color.toLowerCase());
    }
}
