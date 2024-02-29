package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_LENGTH = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public RandomFigure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor().name();

        int randomNumber = random.nextInt(NUMBER_OF_FIGURES);

        switch (randomNumber) {
            case 0:
                return new Circle(random.nextDouble() * DEFAULT_LENGTH, randomColor);
            case 1:
                return new Rectangle(random.nextDouble() * DEFAULT_LENGTH,
                        random.nextDouble() * DEFAULT_LENGTH, randomColor);
            case 2:
                return new RightTriangle(random.nextDouble() * DEFAULT_LENGTH,
                        random.nextDouble() * DEFAULT_LENGTH, randomColor);
            case 3:
                return new Square(random.nextDouble() * DEFAULT_LENGTH, randomColor);
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * DEFAULT_LENGTH,
                        random.nextDouble() * DEFAULT_LENGTH, random.nextDouble() * DEFAULT_LENGTH,
                        randomColor);
            default:
                return null;
        }
    }

    public RandomFigure getDefaultFigure() {
        return new Circle(DEFAULT_LENGTH, Color.WHITE.name());
    }
}
