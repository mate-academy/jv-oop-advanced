package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    @Override
    public void draw() {
        setFigureName("circle");
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
