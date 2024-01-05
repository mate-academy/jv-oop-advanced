package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private String className = this.getClass().getSimpleName();

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String drawing() {
        return "Figure: " + className + ", "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor();
    }
}
