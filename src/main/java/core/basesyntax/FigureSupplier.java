package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_NUMBER = 10;
    private static final int RANDOM_FIGURE = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(RANDOM_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(RANDOM_FIGURE);

        switch (randomFigure) {
            case 0:
                return new Circle(randomNumber, randomColor);
            case 1:
                return new Rectangle(randomNumber, randomNumber, randomColor);
            case 2:
                return new Square(randomNumber, randomColor);
            case 3:
                return new IsoscelesTrapezoid(randomNumber,
                        randomNumber,
                        randomNumber,
                        randomColor);
            case 4:
                return new RightTriangle(randomNumber, randomNumber, randomColor);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
