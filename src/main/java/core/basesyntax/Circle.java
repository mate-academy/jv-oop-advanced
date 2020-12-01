package core.basesyntax;

public class Circle extends Figure {
    int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        area = Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + area + " sq. units, radius: " + radius
                + ", color: " + color;
    }
}
