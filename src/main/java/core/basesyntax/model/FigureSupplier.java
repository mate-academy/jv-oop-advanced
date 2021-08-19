package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        final int maxSize = 20;
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure figure;
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(maxSize));
            case 1:
                return figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(maxSize),
                        random.nextInt(maxSize),
                        random.nextInt(maxSize));
            case 2:
                return figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxSize), random.nextInt(maxSize));
            case 3:
                return figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxSize), random.nextInt(maxSize));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(maxSize));
        }
    }
}
