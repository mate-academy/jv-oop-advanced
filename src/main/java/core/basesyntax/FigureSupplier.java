package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE_FOR_RANDOM = 20;
    private static final double DEFAULT_CIRCLE_RADIUS = 10.0;
    private static final int NUMBERS_OF_FIGURES = 4;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBERS_OF_FIGURES)) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRightTriangle();
            case 2:
                return getRandomTrapezoid();
            default:
                return getRandomRectangle();
        }
    }

    public Figure getRandomSquare() {
        return new Square(color.getRandomColor(), random.nextInt(MAX_VALUE_FOR_RANDOM));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(color.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM), random.nextInt(MAX_VALUE_FOR_RANDOM));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(color.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM), random.nextInt(MAX_VALUE_FOR_RANDOM));
    }

    public Figure getRandomTrapezoid() {
        return new IsoscelesTrapezoid(color.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM), random.nextInt(MAX_VALUE_FOR_RANDOM),
                random.nextInt(MAX_VALUE_FOR_RANDOM));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), DEFAULT_CIRCLE_RADIUS);
    }
}
