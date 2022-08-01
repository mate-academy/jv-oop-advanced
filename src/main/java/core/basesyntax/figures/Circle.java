package core.basesyntax.figures;

import core.basesyntax.EnumFigure;
import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (double)Math.PI * Math.pow(radius,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + EnumFigure.CIRCLE.toString().toLowerCase()
                + ", area: " + getArea() + " units,"
                + " radius: " + radius + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
