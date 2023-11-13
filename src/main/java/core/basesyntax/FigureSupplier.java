package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE_FOR_RANDOM_UNIT = 15;
    private static final double DEFAULT_CIRCLE_RADIUS = 10.0;
    private static final int NUMBERS_OF_FIGURES = 4;
    private final Random randomNum = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (randomNum.nextInt(NUMBERS_OF_FIGURES)) {
            case 0 -> getRandomSquare();
            case 1 -> getRandomRightTriangle();
            case 2 -> getRandomTrapezoid();
            default -> getRandomRectangle();
        };
    }

    public Figure getRandomSquare() {
        return new Square(randomColor.getRandomColor(),
                randomNum.nextInt(MAX_VALUE_FOR_RANDOM_UNIT));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(randomColor.getRandomColor(),
                randomNum.nextInt(MAX_VALUE_FOR_RANDOM_UNIT),
                randomNum.nextInt(MAX_VALUE_FOR_RANDOM_UNIT));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(randomColor.getRandomColor(),
                randomNum.nextInt(MAX_VALUE_FOR_RANDOM_UNIT),
                randomNum.nextInt(MAX_VALUE_FOR_RANDOM_UNIT));
    }

    public Figure getRandomTrapezoid() {
        return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                randomNum.nextInt(MAX_VALUE_FOR_RANDOM_UNIT),
                randomNum.nextInt(MAX_VALUE_FOR_RANDOM_UNIT),
                randomNum.nextInt(MAX_VALUE_FOR_RANDOM_UNIT));
    }

    public Figure getDefaultFigure() {
        return new Circle(ColorSupplier.Color.WHITE.toString().toLowerCase(),
                DEFAULT_CIRCLE_RADIUS);
    }
}
