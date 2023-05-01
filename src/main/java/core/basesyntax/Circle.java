package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        String line = "Figure: Circle, area: ";
        System.out.println(line + calculateArea() + ", radius: " + radius + ", color: " + color);
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * radius * radius);
    }
}
