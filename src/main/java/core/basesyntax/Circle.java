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
    public String draw() {
        return "Figure: " + getClass().getSimpleName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor();
    }
}
