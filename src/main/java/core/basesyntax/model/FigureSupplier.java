package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        final int maxSize = 20;
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(maxSize));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(maxSize),
                        random.nextInt(maxSize),
                        random.nextInt(maxSize));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxSize), random.nextInt(maxSize));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxSize), random.nextInt(maxSize));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(maxSize));
        }
    }
}
