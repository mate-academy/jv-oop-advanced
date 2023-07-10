package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class Square extends Figure {
    private int side;

    public Square(String name, Color color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double resultArea() {
        return side * side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + resultArea() + " sq.units"
                + ", side: " + side + " units, "
                + "color: " + getColor().name());
    }
}
