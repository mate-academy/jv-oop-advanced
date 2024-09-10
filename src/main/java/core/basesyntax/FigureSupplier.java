package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEF_COLOR = "WHITE";
    private static final int MAX_NUMBER = 10;
    private static final int MIN_NUMBER = 1;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEF_COLOR, MAX_NUMBER);
    }

    public Figure getRandomFigure() {
        int randomNumberFirst = random.nextInt(MIN_NUMBER, MAX_NUMBER);
        int randomNumberSecond = random.nextInt(MIN_NUMBER, MAX_NUMBER);
        int randomNumberThird = random.nextInt(MIN_NUMBER, MAX_NUMBER);
        int index = new Random().nextInt(RandomFigure.values().length);
        RandomFigure randomFigure = RandomFigure.values()[index];
        String randomColor = colorSupplier.getRandomColor();

        return switch (randomFigure) {
            case CIRCLE -> new Circle(randomColor, randomNumberFirst);
            case SQUARE -> new Square(randomColor, randomNumberFirst);
            case RECTANGLE -> new Rectangle(randomColor, randomNumberFirst, randomNumberSecond);
            case RIGHT_TRIANGLE -> new RightTriangle(randomColor, randomNumberFirst,
                    randomNumberSecond);
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(randomColor, randomNumberFirst,
                    randomNumberSecond, randomNumberThird);
        };
    }
}
