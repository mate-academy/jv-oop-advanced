package core.basesyntax.figures;

import core.basesyntax.color.Color;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
