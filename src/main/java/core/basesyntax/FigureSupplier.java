package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 6;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_AMOUNT)) {
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getCircle();
            case 3:
                return getRightTriangle();
            case 4:
                return getRectangle();
            case 5:
                return getSquare();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getIsoscelesTrapezoid() {
        double randomMeaningA = random.nextInt(10);
        double randomMeaningB = random.nextInt(10);
        double randomMeaningC = random.nextInt(10);
        return new IsoscelesTrapezoid(randomMeaningB, randomMeaningA,
                randomMeaningC, colorSupplier.getRandomColor());
    }

    private Figure getCircle() {
        double randomMeaningR = random.nextInt(10);
        return new Circle(randomMeaningR, colorSupplier.getRandomColor());
    }

    private Figure getRightTriangle() {
        double randomMeaningA = random.nextInt(10);
        return new RightTriangle(randomMeaningA, colorSupplier.getRandomColor());
    }

    private Figure getRectangle() {
        double randomMeaningA = random.nextInt(10);
        double randomMeaningB = random.nextInt(10);
        return new Rectangle(randomMeaningA, randomMeaningB, colorSupplier.getRandomColor());
    }

    private Figure getSquare() {
        double randomMeaningA = random.nextInt(10);
        return new Square(randomMeaningA, colorSupplier.getRandomColor());
    }
}

