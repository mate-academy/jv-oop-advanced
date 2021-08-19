package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, String figure, int radius) {
        super(color, figure);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure " + getType() + ", area " + getArea() + " sq.u., radius "
                + radius + " u., color " + getColor();
    }
}
