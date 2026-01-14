package core.basesyntax.figures;

import core.basesyntax.enums.FigureType;

public class Square extends Figure {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "+ FigureType.SQUARE + ", area: "
                + this.getArea()
                + " sq. units, side: "
                + side
                + " units, color: "
                + super.getColor());
    }
}

