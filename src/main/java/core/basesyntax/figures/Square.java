package core.basesyntax.figures;

import core.basesyntax.util.Color;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + calculateArea()
                + " sq. units, " + "side: " + side + " units, color: " + getColor());
    }
}
