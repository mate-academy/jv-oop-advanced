package core.basesyntax.figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        String figureName = "circle";
        String message = "Figure: " + figureName + ", area: " + getArea() + " sq.units,"
                + " radius: " + radius + " units, color: " + getColor();
        System.out.println(message);
    }
}
