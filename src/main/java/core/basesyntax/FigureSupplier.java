package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int MAX_SIZE_OF_UNITS = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int numberOfFigure = random.nextInt(NUMBER_OF_FIGURES);
        Figure randomFigure;

        switch (numberOfFigure) {
            case 0:
                randomFigure = new Square(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE_OF_UNITS) + 1);
                break;
            case 1:
                randomFigure = new Rectangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE_OF_UNITS) + 1,
                        random.nextInt(MAX_SIZE_OF_UNITS) + 1);
                break;
            case 2:
                randomFigure = new RightTriangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE_OF_UNITS) + 1,
                        random.nextInt(MAX_SIZE_OF_UNITS) + 1);
                break;
            case 3:
                randomFigure = new Circle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE_OF_UNITS) + 1);
                break;
            case 4:
            default:
                randomFigure = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIZE_OF_UNITS) + 1,
                        random.nextInt(MAX_SIZE_OF_UNITS) + 1,
                        random.nextInt(MAX_SIZE_OF_UNITS) + 1,
                        random.nextInt(MAX_SIZE_OF_UNITS) + 1);
                break;
        }
        return randomFigure;
    }
}
