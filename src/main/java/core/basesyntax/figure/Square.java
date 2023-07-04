package core.basesyntax.figure;

import core.basesyntax.Color;

public class Square extends Figure {
    private final int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square{area: " + getArea() + " square units, " + "side = "
                + side + ", color = " + getColor() + '}');
    }
}
