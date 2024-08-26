package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 4;
    private static final int MAX_RANDOM_VALUE = 10;
    private static final int RADIUS = 10;
    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Drawable getRandomFigure() {
        int value = random.nextInt(NUMBER_OF_FIGURES);
        String color = colorSupplier.getRandomColor().toString();

        switch (value) {
            case 0: {
                return new IsoscelesTrapezoid(color, random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
            }
            case 1: {
                return new Circle(color, random.nextInt(MAX_RANDOM_VALUE) + 1);
            }
            case 2: {
                return new RightTriangle(color, random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
            }
            case 3: {
                return new Rectangle(color, random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
            }
            case 4: {
                return new Square(color, random.nextInt(MAX_RANDOM_VALUE) + 1);
            }
            default: {
                return getDefaultFigure();
            }
        }
    }

    public Drawable getDefaultFigure() {
        return new Circle("white", RADIUS);
    }
}
