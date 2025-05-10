package core.basesyntax.models;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public String draw() {
        StringBuilder info = new StringBuilder();
        info.append("circle, area: ").append(getArea())
                .append(" sq.units, radius: ").append(radius)
                .append(" units, color: ").append(getColor());
        return info.toString();
    }
}
