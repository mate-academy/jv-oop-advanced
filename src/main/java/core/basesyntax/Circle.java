package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + this.getArea() + " sq.units, radius: " + radius
                + " units, color: " + super.getColor();
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }
}
