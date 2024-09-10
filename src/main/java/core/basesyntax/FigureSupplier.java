package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    public Figure getRandomFigure() {
        int randomNumberFirst = random.nextInt(1, 10);
        int randomNumberSecond = random.nextInt(1, 10);
        int randomNumberThird = random.nextInt(1,10);
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
