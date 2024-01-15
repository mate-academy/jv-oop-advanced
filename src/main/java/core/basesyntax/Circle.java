package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure - circle, area = " + String.format("%.1f", getArea()).replace(",", ".")
                + " sq.units, radius = " + radius + " units, color - " + getColor();
    }
}
