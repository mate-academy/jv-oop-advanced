package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_MAX_SIZE = 10;
    private static final int FIGURE_TYPE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureRandomType = random.nextInt(FIGURE_TYPE_COUNT);
        switch (figureRandomType) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getRandomCircle() {
        int figureRandomParameter = random.nextInt(FIGURE_MAX_SIZE) + 1;
        String figureRandomColor = colorSupplier.getRandomColor();
        Figure randomCircle = new Circle(figureRandomColor,
                figureRandomParameter);
        return randomCircle;
    }

    private Figure getRandomSquare() {
        int figureRandomParameter = random.nextInt(FIGURE_MAX_SIZE) + 1;
        String figureRandomColor = colorSupplier.getRandomColor();
        Figure randomSquare = new Square(figureRandomColor,
                figureRandomParameter);
        return randomSquare;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        final int parametersCount = 3;
        int[] figureRandomParameters = new int[parametersCount];
        for (int i = 0; i < parametersCount; i++) {
            figureRandomParameters[i] = random.nextInt(FIGURE_MAX_SIZE) + 1;
        }
        String figureRandomColor = colorSupplier.getRandomColor();
        Figure randomIsoscelesTrapezoid = new IsoscelesTrapezoid(figureRandomColor,
                figureRandomParameters[0],
                figureRandomParameters[1],
                figureRandomParameters[2]);
        return randomIsoscelesTrapezoid;
    }

    private Figure getRandomRectangle() {
        final int parametersCount = 2;
        int[] figureRandomParameters = new int[parametersCount];
        for (int i = 0; i < parametersCount; i++) {
            figureRandomParameters[i] = random.nextInt(FIGURE_MAX_SIZE) + 1;
        }
        String figureRandomColor = colorSupplier.getRandomColor();
        Figure randomRectangle = new Rectangle(figureRandomColor,
                figureRandomParameters[0],
                figureRandomParameters[1]);
        return randomRectangle;
    }

    private Figure getRandomRightTriangle() {
        final int parametersCount = 2;
        int[] figureRandomParameters = new int[parametersCount];
        for (int i = 0; i < parametersCount; i++) {
            figureRandomParameters[i] = random.nextInt(FIGURE_MAX_SIZE) + 1;
        }
        String figureRandomColor = colorSupplier.getRandomColor();
        Figure randomRightTriangle = new RightTriangle(figureRandomColor,
                figureRandomParameters[0],
                figureRandomParameters[1]);
        return randomRightTriangle;
    }

    Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), 10);
    }
}
