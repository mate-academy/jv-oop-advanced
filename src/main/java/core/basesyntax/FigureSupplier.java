package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random rnd = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int figureCount = 5;

    public Figure getRandomFigure() {
        return switch (rnd.nextInt(figureCount)) {
            case 0 -> {
                double width = rnd.nextDouble(1.0, 10.0);
                double height = rnd.nextDouble(1.0, 10.0);
                Color color = colorSupplier.getRandomColor();
                yield new Rectangle(width, height, color);
            }
            case 1 -> {
                double firstLeg = rnd.nextDouble(1.0, 10.0);
                double secondLeg = rnd.nextDouble(1.0, 10.0);
                Color color = colorSupplier.getRandomColor();
                yield new RightTriangle(firstLeg, secondLeg, color);
            }
            case 2 -> {
                double radius = rnd.nextDouble(1.0, 10.0);
                Color color = colorSupplier.getRandomColor();
                yield new Circle(radius, color);
            }
            case 3 -> {
                double side = rnd.nextDouble(1.0, 10.0);
                Color color = colorSupplier.getRandomColor();
                yield new Square(side, color);
            }
            default -> {
                double firstBase = rnd.nextDouble(1.0, 10.0);
                double secondBase = rnd.nextDouble(1.0, 10.0);
                double height = rnd.nextDouble(1.0, 10.0);
                Color color = colorSupplier.getRandomColor();
                yield new IsoscelesTrapezoid(firstBase, secondBase, height, color);
            }
        };
    }
}
