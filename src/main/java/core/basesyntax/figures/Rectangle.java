package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String name, int height, int width, Color color) {
        super(name, color);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", color: " + getColor()
                + ", area: " + format.format(getArea()) + " sq. units, "
                + "height: " + getHeight() + " units, "
                + "width: " + getWidth() + " units");
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }
}
