package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_PROPERTY_SIZE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            default:
                return getCircle(FigureType.RANDOM);
            case 0:
                return getRectangle(FigureType.RANDOM);
            case 1:
                return getRightTriangle(FigureType.RANDOM);
            case 2:
                return getSquare(FigureType.RANDOM);
            case 3:
                return getIsoscelesTrapezoid(FigureType.RANDOM);
        }
    }

    public Figure getDefaultFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            default:
                return getCircle(FigureType.DEFAULT);
            case 0:
                return getRectangle(FigureType.DEFAULT);
            case 1:
                return getRightTriangle(FigureType.DEFAULT);
            case 2:
                return getSquare(FigureType.DEFAULT);
            case 3:
                return getIsoscelesTrapezoid(FigureType.DEFAULT);
        }
    }

    private int getRandomProperySize() {
        return random.nextInt(DEFAULT_PROPERTY_SIZE);
    }

    private Figure getCircle(FigureType figureType) {
        if (figureType == FigureType.DEFAULT) {
            return new Circle(colorSupplier.getRandomColor(),
                    getRandomProperySize());
        } else {
            return new Circle(DEFAULT_COLOR,
                    DEFAULT_PROPERTY_SIZE);
        }
    }

    private Figure getSquare(FigureType figureType) {
        if (figureType == FigureType.DEFAULT) {
            return new Square(colorSupplier.getRandomColor(),
                    getRandomProperySize());
        } else {
            return new Square(DEFAULT_COLOR,
                    DEFAULT_PROPERTY_SIZE);
        }
    }

    private Figure getRectangle(FigureType figureType) {
        if (figureType == FigureType.DEFAULT) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    getRandomProperySize(),
                    getRandomProperySize());
        } else {
            return new Rectangle(DEFAULT_COLOR,
                    DEFAULT_PROPERTY_SIZE,
                    DEFAULT_PROPERTY_SIZE);
        }
    }

    private Figure getRightTriangle(FigureType figureType) {
        if (figureType == FigureType.DEFAULT) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomProperySize(),
                    getRandomProperySize());
        } else {
            return new RightTriangle(DEFAULT_COLOR,
                    DEFAULT_PROPERTY_SIZE,
                    DEFAULT_PROPERTY_SIZE);
        }
    }

    private Figure getIsoscelesTrapezoid(FigureType figureType) {
        if (figureType == FigureType.DEFAULT) {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomProperySize(),
                    getRandomProperySize(),
                    getRandomProperySize());
        } else {
            return new IsoscelesTrapezoid(DEFAULT_COLOR,
                    DEFAULT_PROPERTY_SIZE,
                    DEFAULT_PROPERTY_SIZE,
                    DEFAULT_PROPERTY_SIZE);
        }
    }
}
