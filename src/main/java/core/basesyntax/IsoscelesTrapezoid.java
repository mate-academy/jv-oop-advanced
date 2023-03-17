package core.basesyntax;

import java.util.Random;

class IsoscelesTrapezoid extends AbstractFigure {
    private final Random random = new Random();

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    @Override
    public String draw() {
        double middleLine = random.nextDouble() * 10;
        double height = random.nextDouble() * 10;
        double area = middleLine * height;
        return String.format("Figure: isosceles trapezoid, area: %s sq.units, "
                + "middleLine: %s units, height: %s units", String.format("%.2f", area),
                String.format("%.2f", middleLine), String.format("%.2f", height));
    }
}
