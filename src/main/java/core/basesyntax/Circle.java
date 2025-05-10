package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ")
                .append(area())
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(getColor());
        return builder.toString();
    }
}
