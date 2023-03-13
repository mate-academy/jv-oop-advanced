package core.basesyntax.figures;

import core.basesyntax.FigureTypes;

public class Square extends Figure {
    private double side;
    private double area;

    public Square(double side) {
        this.side = side;
        calculateArea();
    }

    @Override
    public double calculateArea() {
        this.area = this.side * this.side;
        return this.area;
    }

    @Override
    public void draw() {
        System.out.println("Figure:" + FigureTypes.SQUARE + ", "
                + "area: " + this.area + " sq.units, "
                + "side: " + this.side + " units, "
                + "color:" + this.color);
    }
}
