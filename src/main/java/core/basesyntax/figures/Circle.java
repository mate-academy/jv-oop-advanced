package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color,double radius) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Type: circle, color: "
                + getColor()
                + ", area: "
                + getArea()
                + ", radius: "
                + radius);
    }
}
