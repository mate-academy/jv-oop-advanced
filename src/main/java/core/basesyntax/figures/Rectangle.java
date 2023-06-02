package core.basesyntax.figures;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(int side, int height, Color color) {
        this.width = side;
        this.length = height;
        this.color = color;
        this.figureType = FigureType.RECTANGLE;
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
