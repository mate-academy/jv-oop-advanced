package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
