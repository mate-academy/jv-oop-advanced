package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private String color;

    public Circle(String color, int radius) {
        this.radius = radius;
        this.color = color;
    }

    // Override

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName().toLowerCase() + ", area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + color;
    }
}
