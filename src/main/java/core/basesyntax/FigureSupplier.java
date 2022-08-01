package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_NUMBER = 10;
    private static final int RANDOM_FIGURE = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomSide1 = random.nextInt(RANDOM_NUMBER);
        int randomSide2 = random.nextInt(RANDOM_NUMBER);
        int randomSide3 = random.nextInt(RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(RANDOM_FIGURE);

        switch (randomFigure) {
            case 0:
                return new Circle(randomSide1, randomColor);
            case 1:
                return new Rectangle(randomSide1, randomSide2, randomColor);
            case 2:
                return new Square(randomSide1, randomColor);
            case 3:
                return new IsoscelesTrapezoid(randomSide1,
                        randomSide2,
                        randomSide3,
                        randomColor);
            case 4:
                return new RightTriangle(random.nextInt(), random.nextInt(), randomColor);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
