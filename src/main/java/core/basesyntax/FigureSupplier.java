package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SIDE_SIZE_LIMIT = 100;
    private static final int NUMBER_OF_FIGURE_TYPES = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int paramsRandomizer1 = random.nextInt(SIDE_SIZE_LIMIT);
        int paramsRandomizer2 = random.nextInt(SIDE_SIZE_LIMIT);
        String randomColor = colorSupplier.getRandomColor();
        switch (random.nextInt(NUMBER_OF_FIGURE_TYPES)) {
            case 0:
                return new Circle(randomColor, paramsRandomizer1);
            case 1:
                return new Rectangle(randomColor, paramsRandomizer1, paramsRandomizer2);
            case 2:
                return new IsoscelesTrapezoid(randomColor, paramsRandomizer1,
                        paramsRandomizer2, random.nextInt(SIDE_SIZE_LIMIT));
            case 3:
                return new Square(randomColor, paramsRandomizer1);
            case 4:
                return new RightTriangle(randomColor, paramsRandomizer1);
            default:
                return getDefaultFigure();
        }
    }

    public Circle getDefaultFigure() {
        return new Circle("white", 10);
    }
}
