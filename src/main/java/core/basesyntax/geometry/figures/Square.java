package core.basesyntax.geometry.figures;

import core.basesyntax.geometry.Figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + Square.class.getSimpleName() + ", area: " + calculateArea()
                + " sq.units, side: " + side + " units, color: " + getColor() + "\n");
    }
}
