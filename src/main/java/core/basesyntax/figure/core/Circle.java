package core.basesyntax.figure.core;

public class Circle extends Figure {
    private double radius;

    public Circle(String colorOfFigure, double radius) {
        super(colorOfFigure);
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
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColorOfFigure());
    }
}
