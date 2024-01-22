package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area() + " sq. units, "
                + "side: " + side + " units, "
                + "color: " + getColor().toLowerCase());

    }
}
