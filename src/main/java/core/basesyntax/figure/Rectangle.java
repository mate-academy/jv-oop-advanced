package core.basesyntax.figure;

import core.basesyntax.enumforfigure.Color;
import core.basesyntax.enumforfigure.FigureType;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(int side, int height, Color color) {
        super(color, FigureType.RECTANGLE);
        this.width = side;
        this.length = height;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void draw() {
        //Figure: square, area: 25.0 sq.units, side: 5 units, color: blue
        System.out.println("Figure: " + this.figureType + ", area: "
                + this.getArea() + " sq.units, width: " + this.width + " units, length: "
                + this.length + " units, color: " + this.color);
    }
}
