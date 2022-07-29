package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class Circle extends Figure {
    private double radius;
    private double figureArea;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        figureArea = (Math.PI * Math.pow(radius * 0.5, 2));
    }

    @Override
    public void draw() {
        getArea();
        System.out.println("Circle, area: " + figureArea + " , radius: " + radius
                + ", color: " + getColor());
    }
}
