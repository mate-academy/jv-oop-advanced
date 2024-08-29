package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_INDEX = 50;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        String randomColor = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                return new Circle(randomColor, getRandom());
            case 1:
                return new RightTriangle(randomColor, getRandom(), getRandom());
            case 2:
                return new IsoscelesTrapezoid(randomColor, getRandom(),
                        getRandom(), getRandom());
            case 3:
                return new Rectangle(randomColor, getRandom(), getRandom());
            default:
                return new Square(randomColor, getRandom());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandom() {
        return random.nextInt(RANDOM_INDEX);
    }
}
