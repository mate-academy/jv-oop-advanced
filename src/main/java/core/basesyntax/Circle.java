package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
        area = (float) Math.PI * (radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + area
                + " sq. units, radius: " + radius
                + " units, color: " + color;
    }
}
