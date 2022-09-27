package core.basesyntax.model;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius = "
                + radius + " units, colour: " + getColor();
    }
}
