package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor().toString().toLowerCase();
    }
}


