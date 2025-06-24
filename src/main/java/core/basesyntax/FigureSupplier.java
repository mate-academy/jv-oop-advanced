package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public FigureSupplier() {
    }

    public AreaCalculable getRandomFigure() {
        int figureType = ThreadLocalRandom.current().nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double radius = ThreadLocalRandom.current().nextDouble(1, 100);
                return new Circle(color, radius);
            case 1:
                double side = ThreadLocalRandom.current().nextDouble(1, 100);
                return new Square(color, side);
            case 2:
                double width = ThreadLocalRandom.current().nextDouble(1, 100);
                double height = ThreadLocalRandom.current().nextDouble(1, 100);
                return new Rectangle(color, width, height);
            case 3:
                double firstLeg = ThreadLocalRandom.current().nextDouble(1, 100);
                double secondLeg = ThreadLocalRandom.current().nextDouble(1, 100);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 4:
                double base1 = ThreadLocalRandom.current().nextDouble(1, 100);
                double base2 = ThreadLocalRandom.current().nextDouble(1, 100);
                double leg = ThreadLocalRandom.current().nextDouble(
                        Math.abs(base2 - base1) / 2 + 0.01, 100);
                return new IsoscelesTrapezoid(color, base1, base2, leg);
            default:
                return getDefaultFigure();
        }
    }

    public AreaCalculable getDefaultFigure() {
        return new Circle("white", 10);
    }
}

