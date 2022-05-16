package core.basesyntax.models;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: Circle, Area: %s, Radius: %d, Color: %s",
                getSquare(), radius, getColor()));
    }
}
