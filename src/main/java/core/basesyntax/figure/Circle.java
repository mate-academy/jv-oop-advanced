package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.DrawFigure;
import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * Math.PI;
    }

    @Override
    public void toDrawFigure() {
        System.out.println("Figure: circle, "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor());
    }
}
