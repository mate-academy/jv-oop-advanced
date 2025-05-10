package core.basesyntax.models;

import core.basesyntax.Figure;

public class Square implements Figure {
    private final String color;
    private final double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Color: " + color
                + "Type: Square "
                + "Side: " + side);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public String getColor() {
        return color;
    }

    public double getSide() {
        return side;
    }
}
