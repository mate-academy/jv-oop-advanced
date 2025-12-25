package core.basesyntax.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDetails() {
        return "radius: " + radius + " units";
    }

    @Override
    public String getName() {
        return "circle";
    }
}
