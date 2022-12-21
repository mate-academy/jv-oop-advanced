package core.basesyntax;

public class Circle extends Figure{

    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        String params = "Figure: circle, square: " + getArea() + " sq.units, radius: " + radius + " units, color: " + getColor();
        return params;
    }
}