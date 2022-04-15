package core.basesyntax.figure;

import core.basesyntax.supplier.FigureType;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = (getRadius() * getRadius()) * Math.PI;
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + FigureType.CIRCLE + ", area: "
                + String.format("%.2f", getArea()) + " sq.units, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
