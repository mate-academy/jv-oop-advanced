package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String WHITE_COLOR = Color.WHITE.name();
    private static final int BOUNDS = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM_SIZE = 10;
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(BOUNDS);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Square(color, getRandomSize());
            case 1:
                return new Rectangle(color, getRandomSize(), getRandomSize());
            case 2:
                return new RightTriangle(color, getRandomSize(), getRandomSize());
            case 3:
                return new Circle(color, getRandomSize());
            default:
                return new IsoscelesTrapezoid(color, getRandomSize(),
                        getRandomSize(), getRandomSize());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomSize() {
        return random.nextInt(MAX_RANDOM_SIZE) + 1;
    }
}
