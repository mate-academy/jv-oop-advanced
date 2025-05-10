package core.basesyntax.models;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
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
                .append(getArea())
                .append(" sq.units");
        return info.toString();
    }
}
