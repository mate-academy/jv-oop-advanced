package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;

public class Circle extends Figure implements Drawable, AreaCalculator {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw(Figure circle) {
        System.out.println("Figure: circle, area: " + getArea(circle) + " sq. units, "
                                                    + "radius: " + getRadius() + " units, "
                                                    + "color: " + circle.color);
    }

    @Override
    public double getArea(Figure circle) {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    public double getRadius() {
        return radius;
    }
}
