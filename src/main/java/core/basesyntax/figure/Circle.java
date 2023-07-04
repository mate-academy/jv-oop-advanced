package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class Circle extends Figure {
    private int radius = 0;
    private double area = 0;

    public Circle(String name) {
        setName(name);
        randomFigure();
    }

    public Circle(String name, Color color) {
        setName(name);
        setColor(color);
        randomFigure();
    }

    public Circle(String name, int radius, Color color) {
        setName(name);
        setColor(color);
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        resultArea();
    }

    @Override
    public void resultArea() {
        setArea(2 * Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: "
                + getArea() + " sq.units"
                + ", radius: " + getRadius() + " units, "
                + "color: " + getColor().name());
    }

    @Override
    public void randomFigure() {
        setRadius(randomSideFigure());
    }
}
