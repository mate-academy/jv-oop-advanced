package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, Square: " + getArea()
                + " sq.units, Radius: " + radius
                + " units, Color: " + getColor();
    }
}
