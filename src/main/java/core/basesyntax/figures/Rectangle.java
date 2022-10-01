package core.basesyntax.figures;

import core.basesyntax.FiguresClass;

public class Rectangle extends FiguresClass {
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
    public double areaCalculator() {
        return this.height * this.width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area:"
                + this.areaCalculator()
                + " sq.units, height: " + this.getHeight()
                + " width: " + this.getWidth() + " units, color: " + this.getColor());
    }

}
