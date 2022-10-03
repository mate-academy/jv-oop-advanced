package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(int side,String color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:"
                + calculateArea()
                + " sq.units, side: " + this.side
                + " units, color: " + this.getColor());
    }
}

