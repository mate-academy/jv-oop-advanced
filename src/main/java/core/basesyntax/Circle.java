package core.basesyntax;

import java.util.Random;

public class Circle extends AbstractFigure {
    private double radius;

    public Circle(Colors color) {
        super(color);
        Random random = new Random();
        radius = 10 * random.nextDouble();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return String.format("Figure: circle, area: %.2f sq.units, "
        + "radius: %.2f units", calculateArea(), radius);
    }
}
