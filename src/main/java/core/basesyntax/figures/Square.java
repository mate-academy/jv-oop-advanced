package core.basesyntax.figures;

import core.basesyntax.abstractions.Figure;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure "
                        + "square"
                        + ", area:"
                        + calculateArea()
                        + ", side = "
                        + side
                        + ", color: " + super.getColor());
    }
}
