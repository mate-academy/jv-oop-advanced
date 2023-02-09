package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_PROPERTY_SIZE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int NUMBER_OF_FIGURES = 5;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color thisFiguresColor = colorSupplier.getRandomColor();
        switch (new Random().nextInt(NUMBER_OF_FIGURES)) {
            default:
                return new Circle(thisFiguresColor,
                        getRandomProperySize());
            case 0:
                return new Square(thisFiguresColor,
                        getRandomProperySize());
            case 1:
                return new Rectangle(thisFiguresColor,
                        getRandomProperySize(),
                        getRandomProperySize());
            case 2:
                return new RightTriangle(thisFiguresColor,
                        getRandomProperySize(),
                        getRandomProperySize());
            case 3:
                return new IsoscelesTrapezoid(thisFiguresColor,
                        getRandomProperySize(),
                        getRandomProperySize(),
                        getRandomProperySize());
        }
    }

    private int getRandomProperySize() {
        return random.nextInt(DEFAULT_PROPERTY_SIZE);
    }

    public Figure getDefaultFigure() {
        switch (new Random().nextInt(NUMBER_OF_FIGURES)) {
            default:
                return new Square(DEFAULT_COLOR,
                        DEFAULT_PROPERTY_SIZE);
            case 0:
                return new Circle(DEFAULT_COLOR,
                        DEFAULT_PROPERTY_SIZE);
            case 1:
                return new Rectangle(DEFAULT_COLOR,
                        DEFAULT_PROPERTY_SIZE,
                        DEFAULT_PROPERTY_SIZE);
            case 2:
                return new RightTriangle(DEFAULT_COLOR,
                        DEFAULT_PROPERTY_SIZE,
                        DEFAULT_PROPERTY_SIZE);
            case 3:
                return new IsoscelesTrapezoid(DEFAULT_COLOR,
                        DEFAULT_PROPERTY_SIZE,
                        DEFAULT_PROPERTY_SIZE,
                        DEFAULT_PROPERTY_SIZE);
        }
    }
}
