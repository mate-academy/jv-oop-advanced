package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIZE = 15;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(NUMBER_OF_FIGURES);

        switch (randomFigure) {
            case 0:
                return new Circle(getRandomSize(), randomColor);
            case 1:
                return new Rectangle(getRandomSize(), getRandomSize(), randomColor);
            case 2:
                return new Square(getRandomSize(), randomColor);
            case 3:
                return new RightTriangle(getRandomSize(), getRandomSize(), randomColor);
            default:
                return new IsoscelesTrapezoid(getRandomSize(), getRandomSize(), getRandomSize(),
                        randomColor);
        }
    }

    public int getRandomSize() {
        int randomSize = random.nextInt(MAX_SIZE);
        return randomSize;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
