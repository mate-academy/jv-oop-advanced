package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ").append(getArea())
                .append(" sq.units, radius: ").append(radius)
                .append(" units, color: ").append(color.toLowerCase());
        return builder.toString();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
