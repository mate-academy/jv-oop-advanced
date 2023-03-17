package core.basesyntax;

import java.util.Random;

class Circle extends AbstractFigure {
    private final Random random = new Random();

    public Circle(String color) {
        super(color);
    }

    @Override
    public String draw() {
        double radius = 10 * random.nextDouble();
        double area = Math.PI * radius;
        return String.format("Figure: circle, area: %s sq.units, radius: %s units",
               String.format("%.2f", area), String.format("%.2f", radius));
    }
}
