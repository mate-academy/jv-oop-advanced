package core.basesyntax.figure;

import core.basesyntax.behaviour.FigureAreaCalculator;
import core.basesyntax.tools.Color;

public class Circle extends Figure implements FigureAreaCalculator {
    private int radius;
    private double area;

    public Circle(String name, Color color, int radius) {
        super(name, color);
        this.radius = radius;
        resultArea();
    }

    public Circle(String name, int radius, Color color) {
        super(name, color);
        this.radius = radius;
        resultArea();
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
}
