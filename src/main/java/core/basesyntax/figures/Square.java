package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square has side " + side + " and area " + getArea()
                + " units " + "color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
