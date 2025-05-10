package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        String line = "Figure: Circle, area: ";
        System.out.println(line + calculateArea() + ", radius: " + radius
                + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * radius * radius);
    }
}
