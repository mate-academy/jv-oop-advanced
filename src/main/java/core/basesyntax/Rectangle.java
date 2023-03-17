package core.basesyntax;

import java.util.Random;

class Rectangle extends AbstractFigure {
    private final Random random = new Random();

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public String draw() {
        double width = random.nextDouble() * 10;
        double length = random.nextDouble() * 10;
        double area = width * length;
        return String.format("Figure: rectangle, area: %s sq.units, "
                + "width: %s units, length: %s units", String.format("%.2f", area),
                String.format("%.2f", width), String.format("%.2f", length));
    }
}
