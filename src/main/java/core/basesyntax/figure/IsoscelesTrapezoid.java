package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.constants.Messages;

public class IsoscelesTrapezoid extends Figure{
    private static final String FIGURE_NAME = "isosceles trapezoid";
    private double height;
    private double topBase;
    private double bottomBase;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height) {
        if (topBase <= 0 || bottomBase <= 0 || height <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        if (topBase <= 0 || bottomBase <= 0 || height <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public IsoscelesTrapezoid(Color color, double topBase, double bottomBase, double height) {
        if (topBase <= 0 || bottomBase <= 0 || height <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color.name().toLowerCase();
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public void draw() {
        String str = "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, top base: "
                + topBase + ", bottom base: " + bottomBase + ", leg: " + height + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }

    public void setTopBase(double topBase) {
        if (topBase <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.topBase = topBase;
    }

    public void setBottomBase(double bottomBase) {
        if (bottomBase <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.bottomBase = bottomBase;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.height = height;
    }

    public double getTopBase() {
        return topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getHeight() {
        return height;
    }
}
