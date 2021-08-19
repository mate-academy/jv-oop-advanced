package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int SIZE_OF_UNITS = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public int getRandomNumber() {
        return random.nextInt(SIZE_OF_UNITS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(), getRandomNumber());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber());
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber());
                break;
            case 3:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber());
                break;
            default:
                figure = new Square(colorSupplier.getRandomColor(),
                        getRandomNumber());
                break;
        }
        return figure;
    }
}
