package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: " + getClass().getSimpleName().toLowerCase() + ", area: " + getArea()
                + ", radius: " + radius + ", color: " + getColor() + ".";
    }
}
