package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Circle{"
                + "radius=" + radius
                + ", color='" + color
                + '\'' + '}';
    }
}
