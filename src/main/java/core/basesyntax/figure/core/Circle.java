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
    public double obtainTheArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + obtainTheArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColorOfFigure());
    }
}
