package core.basesyntax.figures;

import core.basesyntax.FigureTypes;

public class Rectangle extends Figure {
    private double length;
    private double width;
    private double area;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
    }

    @Override
    public double calculateArea() {
        this.area = this.length * this.width;
        return this.area;
    }

    @Override
    public void draw() {
        System.out.println("Figure:" + FigureTypes.RECTANGLE + ", "
                + "area: " + this.area + " sq.units, "
                + "length: " + this.length + " units, "
                + "width: " + this.width + " units, "
                + "color:" + this.color);
    }
}
