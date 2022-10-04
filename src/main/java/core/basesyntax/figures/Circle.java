package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle" + ", color= " + color + ", area= "
                + getArea() + " unit sq., radius=" + radius);
    }
}
