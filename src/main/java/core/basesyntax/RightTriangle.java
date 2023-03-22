package core.basesyntax;

import java.util.Random;

class RightTriangle extends AbstractFigure {
    private double width;
    private double height;

    public RightTriangle(Colors color) {
        super(color);
        Random random = new Random();
        width = random.nextDouble() * 10;
        height = random.nextDouble() * 10;
    }

    @Override
    public double calculateArea() {
        return (width * height) / 2;
    }

    @Override
    public String draw() {
        return String.format("Figure: right triangle, area: %.2f sq.units, "
        + "width: %.2f units, height: %.2f units",
       calculateArea(), width, height);
    }
}
