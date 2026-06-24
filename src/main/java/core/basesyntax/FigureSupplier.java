package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int PARAMS_BOUND = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final int INDEX_BOUND = 5;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static String randomColor;
    private final Random random = new Random();
    private final int figureIndex = random.nextInt(INDEX_BOUND);

    public Figure getRandomFigure() {
        randomColor = colorSupplier.getRandomColor();
        switch (figureIndex) {
            case 0: {
                int radius = getRandomSize();
                return new Circle(radius, randomColor);
            }
            case 1: {
                int firstBase = getRandomSize();
                int secondBase = getRandomSize();
                int side = getRandomSize();
                return new IsoscelesTrapezoid(firstBase, secondBase, side, randomColor);
            }
            case 2: {
                int heigth = getRandomSize();
                int width = getRandomSize();
                return new Rectangle(heigth, width, randomColor);
            }
            case 3: {
                int firstLeg = getRandomSize();
                int secondLeg = getRandomSize();
                return new RightTriangle(firstLeg, secondLeg, randomColor);
            }
            case 4: {
                int side = getRandomSize();
                return new Square(side, randomColor);
            }
            default: throw new IllegalArgumentException("Unknown figure type: " + figureIndex);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }

    private int getRandomSize() {
        return random.nextInt(PARAMS_BOUND + 1);
    }
}
