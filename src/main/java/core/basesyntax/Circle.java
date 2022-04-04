package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public String getRandomParameters() {
        return "Figure: circle, area: " + area()
                + " sq.units, radius: " + radius
                + " units, color: " + color;
    }
}
