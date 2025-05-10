package core.basesyntax.figures;

import core.basesyntax.Color;

public class Square extends Figure {
    private int side;
    private String name = "Square";

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + "sq.units, side: " + side + ", color: " + getColor());

    }
}
