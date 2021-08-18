package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE));
            case 1:
                return figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 2:
                return figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
            case 3:
                return figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
        }

    }
}
