package core.basesyntax;

import auxiliary.Figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius) {
        super.setRandomColor();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    public String toString() {
        return "Figure: Circle, "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor();
    }
}
