package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Color;
import core.basesyntax.Drawable;
import core.basesyntax.Figure;

public class Circle extends Figure implements AreaCalculator, Drawable {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + Math.rint(getArea())
                    + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
