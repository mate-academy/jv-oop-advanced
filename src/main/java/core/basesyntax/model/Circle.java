package core.basesyntax.model;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, Color color) {
        super(Math.PI * Math.pow(radius, 2), color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return new StringBuilder("Circle: ")
                .append("area = ")
                .append(this.getArea())
                .append(", radius = ")
                .append(this.radius)
                .append(", color = ")
                .append(this.getColor())
                .toString();
    }

    public int getRadius() {
        return radius;
    }
}
