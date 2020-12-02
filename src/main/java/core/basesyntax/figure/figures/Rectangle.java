package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;

public class Rectangle extends Figure {

    private int width;
    private int height;

    public Rectangle(Color color, int height, int width) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("#######");
        System.out.println("#     #");
        System.out.println("#######");
    }

    @Override
    public double getSquare() {
        return getWidth() * getHeight();
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

    public String toString() {
        return getColor() + " " + getClass().getSimpleName() + " with height "
                + getHeight() + " units, width " + getWidth()
                + " units, and square " + getSquare() + " sq. units.";
    }
}
