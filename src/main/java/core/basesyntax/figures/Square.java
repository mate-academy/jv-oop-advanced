package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square\nColor: " + getColor().name()
                + "\nArea: " + calculateArea()
                + "\nSide: " + side);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
