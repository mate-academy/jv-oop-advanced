package core.basesyntax;

import java.util.Random;

class RightTriangle extends AbstractFigure {
    private final Random random = new Random();

    public RightTriangle(String color) {
        super(color);
    }

    @Override
    public String draw() {
        double width = random.nextDouble() * 10;
        double height = random.nextDouble() * 10;
        double area = (width * height) / 2;
        return String.format("Figure: right triangle, area: %s sq.units, "
               + "width: %s units, height: %s units",
               String.format("%.2f", area), String.format("%.2f", width),
               String.format("%.2f", height));
    }
}
