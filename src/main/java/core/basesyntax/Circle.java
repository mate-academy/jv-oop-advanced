package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + color;
    }
}
