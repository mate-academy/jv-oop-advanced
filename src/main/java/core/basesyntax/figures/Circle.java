package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area()
                + " units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}
