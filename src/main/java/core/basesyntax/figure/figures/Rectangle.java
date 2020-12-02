package core.basesyntax.figure.figures;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Shape;

public class Rectangle extends Figure {

    public static final Shape NAME = Shape.RECTANGLE;
    private double width;
    private double height;

    public Rectangle(Color color, double height, double width) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return getWidth() * getHeight();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return getColor() + " " + NAME + " with height, "
                + getHeight() + " width " + getWidth() + ", and square " + getSquare();
    }
}
