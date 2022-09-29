package core.basesyntax.figures;

import core.basesyntax.suppliers.Color;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getFormatted(getArea())
                + " sq.units, radius: "
                + getFormatted(getRadius())
                + " color: "
                + getColor().name().toLowerCase());
    }
}
