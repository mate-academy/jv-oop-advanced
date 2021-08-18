package core.basesyntax.figureClasses;

import core.basesyntax.colors.Color;

import java.util.Random;

public class Circle extends Figure {
    private double radius;

    public Circle(String colorOfFigure, double radius) {
        super(colorOfFigure);
        this.radius = radius;
    }

    public Circle(String colorOfFigure, Random random) {
        this(colorOfFigure, random.nextDouble() * 10);
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
