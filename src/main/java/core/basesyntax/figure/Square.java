package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.constants.Messages;

public class Square extends Figure{
    private double side;
    private static final String FIGURE_NAME = "square";

    public Square(double side){
        this.side = side;
    }

    public Square(String color, double side){
        if (side <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color;
        this.side = side;
    }

    public Square(Color color, double side){
        if (side <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        if (color == null) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color.name().toLowerCase();
        this.side = side;
    }

    @Override
    public void draw() {
        String str = "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, side: " + side + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_PARAMS);
        }

        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
