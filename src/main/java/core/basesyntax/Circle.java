package core.basesyntax;

import core.basesyntax.behavior.Draw;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        setColor(color);
        this.radius = radius;
        areaCalculate();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());

    }

    @Override
    public void areaCalculate() {

        setArea(Math.PI * (Math.pow(radius, 2)));
    }
}
