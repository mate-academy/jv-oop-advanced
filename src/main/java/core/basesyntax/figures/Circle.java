package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public void drow() {
        System.out.println("name= " + name + ", color= " + color + ", area= "
                + getArea() + " unit sq., radius=" + radius);
    }
}
