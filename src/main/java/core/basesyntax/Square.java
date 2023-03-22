package core.basesyntax;

import java.util.Random;

public class Square extends AbstractFigure {
    private double side;

    public Square(Colors color) {
        super(color);
        Random random = new Random();
        side = random.nextDouble() * 10;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return String.format("Figure: square, area: %.2f sq.units, "
        + "side: %.2f units", calculateArea(), side);
    }
}
