package core.basesyntax.models;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius > 0 ? radius : 1;
        this.setColor(color);
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
