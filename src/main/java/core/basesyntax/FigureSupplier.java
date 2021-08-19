package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int MAX_SIZE_OF_UNITS = 10;
    private Random random = new Random();

    private int getRandomNumber(int limit) {
        return random.nextInt(limit) + 1;
    }

    public Figure getRandomFigure() {
        int numberOfFigure = getRandomNumber(NUMBER_OF_FIGURES);
        Figure randomFigure;

        switch (numberOfFigure) {
            case 0:
                randomFigure = new Square(new ColorSupplier().getRandomColor(),
                        getRandomNumber(MAX_SIZE_OF_UNITS));
                break;
            case 1:
                randomFigure = new Rectangle(new ColorSupplier().getRandomColor(),
                        getRandomNumber(MAX_SIZE_OF_UNITS),
                        getRandomNumber(MAX_SIZE_OF_UNITS));
                break;
            case 2:
                randomFigure = new RightTriangle(new ColorSupplier().getRandomColor(),
                        getRandomNumber(MAX_SIZE_OF_UNITS),
                        getRandomNumber(MAX_SIZE_OF_UNITS));
                break;
            case 3:
                randomFigure = new Circle(new ColorSupplier().getRandomColor(),
                        getRandomNumber(MAX_SIZE_OF_UNITS));
                break;
            case 4:
            default:
                randomFigure = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        getRandomNumber(MAX_SIZE_OF_UNITS),
                        getRandomNumber(MAX_SIZE_OF_UNITS),
                        getRandomNumber(MAX_SIZE_OF_UNITS),
                        getRandomNumber(MAX_SIZE_OF_UNITS));
                break;
        }
        return randomFigure;
    }
}
