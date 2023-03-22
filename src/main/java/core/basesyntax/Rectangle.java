package core.basesyntax;

import java.util.Random;

public class Rectangle extends AbstractFigure {
    private double width;
    private double length;

    public Rectangle(Colors color) {
        super(color);
        Random random = new Random();
        width = random.nextDouble() * 10;
        length = random.nextDouble() * 10;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public String draw() {
        return String.format("Figure: rectangle, area: %.2f sq.units, "
        + "width: %.2f units, length: %.2f units",
        calculateArea(), width, length);
    }
}
