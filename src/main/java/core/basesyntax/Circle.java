package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Circle: area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, " + "color: " + getColor();
    }

    @Override
    public String toString() {
        return draw();
    }
}
