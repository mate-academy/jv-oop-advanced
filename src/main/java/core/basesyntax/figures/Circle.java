package core.basesyntax.figures;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;

public class Circle extends Figure {
    private int radius;

    public Circle(int side, Color color) {
        this.radius = side;
        this.color = color;
        figureType = FigureType.CIRCLE;
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
