package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int LIMIT_FOR_FIGURE_PARAMETER = 16;
    private static final int DEFAULT_FIGURE_RADIUS = 10;
    private static final String DEFAULT_FIGURE_COLOR = "WHITE";
    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);

        int paramA = random.nextInt(LIMIT_FOR_FIGURE_PARAMETER);
        int paramB = random.nextInt(LIMIT_FOR_FIGURE_PARAMETER);
        int paramC = random.nextInt(LIMIT_FOR_FIGURE_PARAMETER);
        int paramD = random.nextInt(LIMIT_FOR_FIGURE_PARAMETER);
        String randomColor = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                return new Square(paramA, randomColor);
            case 1:
                return new Rectangle(paramA, paramB, randomColor);
            case 2:
                return new RightTriangle(paramA, paramB, randomColor);
            case 3:
                return new Circle(paramA, randomColor);
            case 4:
                return new IsoscelesTrapezoid(paramA, paramB, paramC, paramD, randomColor);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_RADIUS, DEFAULT_FIGURE_COLOR.toLowerCase());
    }
}
