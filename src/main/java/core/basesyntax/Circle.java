package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * (radius * radius));
    }

    @Override
    public String toString() {
        return "Figure: "
                + this.getClass().getSimpleName().toLowerCase() + ", "
                + "area: " + this.calculateArea() + " sq. units, "
                + "radius: " + this.radius + ", "
                + "color: " + getColor().toString()
                + '}';
    }
}
