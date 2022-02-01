package core.basesyntax.entity;

public class Circle extends Figure{

    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + this.radius + " units, color: " + this.color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
