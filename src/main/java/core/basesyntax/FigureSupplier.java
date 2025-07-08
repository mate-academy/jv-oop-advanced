package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int MAX_RANDOM_NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int figureType = random.nextInt(NUMBER_OF_FIGURE);
        switch (figureType) {
            case 0 -> {
                return new Square(randomColor, random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 1 -> {
                return new Rectangle(randomColor, random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 2 -> {
                return new RightTriangle(randomColor, random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 3 -> {
                return new Circle(randomColor, random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 4 -> {
                return new IsoscelesTrapezoid(randomColor, random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
            }
            default -> {
                return new Circle(Color.WHITE.name(), MAX_RANDOM_NUMBER);

            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), MAX_RANDOM_NUMBER);
    }
}
