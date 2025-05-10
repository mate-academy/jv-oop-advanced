package core.basesyntax.model;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        new StringBuilder().append("Figure: Circle, area: ")
                .append(calculateArea())
                .append(" sq.units, radius: ")
                .append(getRadius())
                .append(" units, color: ")
                .append(getColor());
    }
}
