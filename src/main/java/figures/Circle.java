package figures;

import behavior.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
