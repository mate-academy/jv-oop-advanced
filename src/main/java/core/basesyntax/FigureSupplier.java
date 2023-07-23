package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_NUMBER = 5;
    private static final int RANDOM_VALUE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    Figure getRandomFigure() {
        int randomInt = random.nextInt(FIGURE_NUMBER);
        String randomColor = colorSupplier.getRandomColor();
        switch (randomInt) {
            case 0:
                return new Square(randomColor, random.nextInt(RANDOM_VALUE));
            case 1:
                return new Rectangle(randomColor, random.nextInt(RANDOM_VALUE),
                        random.nextInt(RANDOM_VALUE));
            case 2:
                return new RightTriangle(randomColor, random.nextInt(RANDOM_VALUE),
                        random.nextInt(RANDOM_VALUE));
            case 3:
                return new Circle(randomColor, random.nextInt(RANDOM_VALUE));
            default:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextInt(RANDOM_VALUE), random.nextInt(RANDOM_VALUE),
                        random.nextInt(RANDOM_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
