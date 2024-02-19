package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Color;
import core.basesyntax.Drawable;

public class Circle extends Figure implements AreaCalculator, Drawable {
    private final double radius;
    private Color color;

    public Circle(Color color,double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq. units, radius: "
                + radius + " unit, color: " + color);
    }
}
