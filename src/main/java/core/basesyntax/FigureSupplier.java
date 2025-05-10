package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int RANDOM_MULTIPLIER = 100;
    private static final int DEFAULT_CIRCLE_RAD = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_NUMBER) + 1;
        Color randomColor = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 1:
                return new Square(randomColor, random.nextDouble() * RANDOM_MULTIPLIER);
            case 2:
                return new Circle(randomColor,random.nextDouble() * RANDOM_MULTIPLIER);
            case 3:
                return new Rectangle(randomColor, random.nextDouble() * RANDOM_MULTIPLIER,
                        random.nextDouble() * RANDOM_MULTIPLIER);
            case 4:
                return new RightTriangle(
                        randomColor, random.nextDouble() * RANDOM_MULTIPLIER);
            case 5:
                return new IsoscelesTrapezoid(randomColor, random.nextDouble() * RANDOM_MULTIPLIER,
                        random.nextDouble() * RANDOM_MULTIPLIER,
                        random.nextDouble() * RANDOM_MULTIPLIER);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_CIRCLE_RAD);
    }
}
