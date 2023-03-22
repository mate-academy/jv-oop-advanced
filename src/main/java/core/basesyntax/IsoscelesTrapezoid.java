package core.basesyntax;

import java.util.Random;

class IsoscelesTrapezoid extends AbstractFigure {
    private double middleLine;
    private double height;

    public IsoscelesTrapezoid(Colors color) {
        super(color);
        Random random = new Random();
        middleLine = random.nextDouble() * 10;
        height = random.nextDouble() * 10;
    }

    @Override
    public double calculateArea() {
        return middleLine * height;
    }

    @Override
    public String draw() {
        return String.format("Figure: isosceles trapezoid, area: %.2f sq.units, "
        + "middleLine: %.2f units, height: %.2f units",
        calculateArea(), middleLine, height);
    }
}
