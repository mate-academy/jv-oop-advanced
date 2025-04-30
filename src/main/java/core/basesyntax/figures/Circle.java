package core.basesyntax.figures;

import core.basesyntax.FigureTypes;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
    }

    @Override
    public double calculateArea() {
        this.area = Math.PI * this.radius * this.radius;
        return this.area;
    }

    @Override
    public void draw() {
        System.out.println("Figure:" + FigureTypes.CIRCLE + ", "
                + "area: " + this.area + " sq.units, "
                + "radius: " + this.radius + " units, "
                + "color:" + this.color);
    }
}
