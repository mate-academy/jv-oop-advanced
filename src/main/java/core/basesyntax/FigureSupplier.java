package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_FIGURE_SIZE = 100;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomParameters = random.nextInt(MAX_FIGURE_SIZE) + 1;
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(FIGURE_COUNT);

        switch (randomFigure) {
            case 0:
                return new RightTriangle(randomColor, randomParameters, randomParameters);
            case 1:
                return new Square(randomColor, randomParameters);
            case 2:
                return new Rectangle(randomColor, randomParameters, randomParameters);
            case 3:
                return new IsoscelesTrapezoid(randomColor, randomParameters, randomParameters,
                        randomParameters);
            default:
                return new Circle(randomColor, randomParameters);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }
}
