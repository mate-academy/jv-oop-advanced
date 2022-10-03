package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height,String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area:"
                + this.calculateArea()
                + " sq.units, height: " + this.getHeight()
                + " width: " + this.getWidth() + " units, color: " + this.getColor());
    }

}
