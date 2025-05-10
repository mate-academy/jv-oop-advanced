package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final int SIZE_LIMIT = 99;
    private static final String COLOR_OF_CIRCLE = Color.WHITE.name();
    private static final int RADIUS_OF_CIRCLE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        String randomColor = colorSupplier.getRandomColor();

        switch (randomNumber) {
            case 0:
                return new Circle(randomColor, randomSize());
            case 1:
                return new IsoscelesTrapezoid(randomColor, randomSize(), randomSize());
            case 2:
                return new Rectangle(randomColor, randomSize(), randomSize());
            case 3:
                return new RightTriangle(randomColor, randomSize(), randomSize());
            case 4:
                return new Square(randomColor, randomSize());
            default:
                return new Circle(COLOR_OF_CIRCLE, RADIUS_OF_CIRCLE);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_OF_CIRCLE, RADIUS_OF_CIRCLE);
    }

    private int randomSize() {
        return random.nextInt(SIZE_LIMIT) + 1;
    }
}
