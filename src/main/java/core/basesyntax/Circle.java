package core.basesyntax;

import core.basesyntax.interfaces.Calculatable;
import core.basesyntax.interfaces.Drawable;

public class Circle extends Figure implements Calculatable, Drawable {
    private double radius;

    public Circle(String name, Enum color, double radius) {
        super(name, color);
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
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", " + "area: "
                + String.format("%.2f", getArea()) + " sq. units, "
                + "radius: " + String.format("%.2f", radius)
                + " units, " + "color: " + getColor());
    }
}
