package core.basesyntax.figures;

import core.basesyntax.colorSupplier.Color;

public class Square extends Figure{
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Square: color - " + getColor().name()
                           + ", area - " + getArea()
                           + ", side - " + side
                           + '.');
    }
}
