package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super.setColor(color);
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + String.format("%.1f", calculateArea())
                + " sq.units, side: " + radius
                + " units, color: " + getColor();
    }
}
