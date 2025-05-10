package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + " sq.units, radius: "
                + radius
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
