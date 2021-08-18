package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int SIZE_OF_UNITS = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(),
                        new Random().nextInt(SIZE_OF_UNITS) + 1);
                break;
            case 1:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS),
                        random.nextInt(SIZE_OF_UNITS),
                        random.nextInt(SIZE_OF_UNITS));
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS),
                        random.nextInt(SIZE_OF_UNITS));
                break;
            case 3:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS),
                        random.nextInt(SIZE_OF_UNITS));
                break;
            default:
                figure = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS));
                break;
        }
        return figure;
    }
}
