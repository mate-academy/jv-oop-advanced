package core.basesyntax.figure;

import core.basesyntax.figure.enums.Color;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw() {
        double area = side * side;
        System.out.println("Figure: square, "
                + "area: " + area + " sq. units, "
                + "side: " + side + " units");
    }
}
