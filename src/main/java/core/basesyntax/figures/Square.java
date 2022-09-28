package core.basesyntax.figures;

import core.basesyntax.interfaces.Area;
import core.basesyntax.interfaces.Drawing;

public class Square extends Figure implements Area, Drawing {
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
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, sides: " + side + " units, color: " + getColor());
    }
}
