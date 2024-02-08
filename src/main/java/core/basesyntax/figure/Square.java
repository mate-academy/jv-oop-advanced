package core.basesyntax.figure;

import core.basesyntax.enumforfigure.Color;
import core.basesyntax.enumforfigure.FigureType;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color, FigureType.SQUARE);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        //Figure: square, area: 25.0 sq.units, side: 5 units, color: blue
        System.out.println("Figure: " + this.figureType + ", area: "
                + this.getArea() + " sq.units, side: " + this.side
                + " units, color: " + this.color);
    }
}
