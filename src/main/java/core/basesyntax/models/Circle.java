package core.basesyntax.models;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String printInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: circle, radius - ")
                .append(getRadius())
                .append(" units, color - ")
                .append(getColor())
                .append(", area - ")
                .append(area())
                .append(" sq.units");
        return info.toString();
    }
}
