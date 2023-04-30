package core.basesyntax;

public class Circle extends Figure {
    private Color color;
    private int radius;

    public Circle(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        String line = "Figure: Circle, area: ";
        System.out.println(line + area() + ", radius: " + radius + ", color: " + color);
    }

    @Override
    public double area() {
        return Math.round(Math.PI * radius * radius);
    }
}
