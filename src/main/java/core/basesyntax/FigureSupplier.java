package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUMBER_OF_FIGURE = 5;
    public static final int SIZE_OF_UNITS = 100;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(MAX_NUMBER_OF_FIGURE);
        Figure randomFigure;
        switch (figureNumber) {
            case 0:
                randomFigure = new Square(new ColorSupplier().getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS) + 1);
                break;
            case 1:
                randomFigure = new Rectangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS) + 1,
                        random.nextInt(SIZE_OF_UNITS) + 1);
                break;
            case 2:
                randomFigure = new RightTriangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS) + 1,
                        random.nextInt(SIZE_OF_UNITS) + 1);
                break;
            case 3:
                randomFigure = new Circle(new ColorSupplier().getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS) + 1);
                break;
            case 4:
            default:
                randomFigure = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        random.nextInt(SIZE_OF_UNITS) + 1,
                        random.nextInt(SIZE_OF_UNITS) + 1,
                        random.nextInt(SIZE_OF_UNITS) + 1);
                break;
        }
        return randomFigure;
    }
}
