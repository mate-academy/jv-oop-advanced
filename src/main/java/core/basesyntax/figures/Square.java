package core.basesyntax.figures;

import core.basesyntax.Color;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square{"
                + "color=" + color
                + ", side=" + side
                + ", area=" + getArea()
                + '}');
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
