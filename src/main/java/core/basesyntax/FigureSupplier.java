package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int FIGURE_AMOUNT = 5;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = color.getRandomColor();
        int sideA = random.nextInt(BOUND) + 1;
        int sideB = random.nextInt(BOUND) + 1;
        int height = random.nextInt(BOUND) + 1;

        switch (random.nextInt(FIGURE_AMOUNT)) {
            case 0:
                return new Circle(randomColor, sideA);
            case 1:
                return new IsoscelesTrapezoid(randomColor, sideA, sideB, height);
            case 2:
                return new Rectangle(randomColor, sideA, sideB);
            case 3:
                return new RightTriangle(randomColor, sideA, sideB);
            default:
                return new Square(randomColor, sideA);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
