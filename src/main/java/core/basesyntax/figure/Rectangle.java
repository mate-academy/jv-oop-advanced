package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.constants.Messages;

public class Rectangle extends Figure {
    private static final String FIGURE_NAME = "rectangle";
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, double height, double width) {
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color;
        this.height = height;
        this.width = width;
    }

    public Rectangle(Color color, double height, double width) {
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color.name().toLowerCase();
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.height = height;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.width = width;
    }

    public void setSides(double height, double width) {
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void draw() {
        String str = "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, height: "
                + height + ", width: " + width + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
