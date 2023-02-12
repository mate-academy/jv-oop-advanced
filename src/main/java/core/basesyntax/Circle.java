package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", color: " + getColor()
                + ", radius: " + radius
                + ", area: " + calculateArea());
    }
}
