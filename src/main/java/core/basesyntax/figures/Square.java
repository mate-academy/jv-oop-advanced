
package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq.units, side: " + side + " units, color: "
                + getColor());
    }
}