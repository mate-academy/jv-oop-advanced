package core.basesyntax.model;

public class Circle extends Figure {

    private final int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
        this.area = Math.round(Math.PI * Math.pow(radius, 2));
    }

    public Circle() {
        this((int) (Math.random() * 19) + 1, Color.randomColor());
    }

    @Override
    public String draw() {
        return new StringBuilder("Circle: ")
                .append("area = ")
                .append(this.area)
                .append(", radius = ")
                .append(this.radius)
                .append(", color = ")
                .append(this.color)
                .toString();
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return this.color;
    }

}
