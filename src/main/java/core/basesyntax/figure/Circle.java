package core.basesyntax.figure;

import core.basesyntax.enumforfigure.Color;
import core.basesyntax.enumforfigure.FigureType;

public class Circle extends Figure {
    private int radius;

    public Circle(int side, Color color) {
        super(color, FigureType.CIRCLE);
        this.radius = side;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void draw() {
        //Figure: square, area: 25.0 sq.units, side: 5 units, color: blue
        System.out.println("Figure: " + this.figureType + ", area: "
                + this.getArea() + " sq.units, radius: " + this.radius
                + " units, color: " + this.color);
    }
}
