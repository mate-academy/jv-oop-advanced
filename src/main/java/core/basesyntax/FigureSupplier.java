package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_RANDOM_CASES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_RANDOM_CASES);
        String randomColor = colorSupplier.getRandomColor();
        switch (index) {
            case 0: return new Circle(randomColor,
                    randomDouble());
            case 1: return new Square(randomColor,
                    randomDouble());
            case 2: return new Rectangle(randomColor,
                    randomDouble(),
                    randomDouble());
            case 3: return new RightTriangle(randomColor,
                    randomDouble(),
                    randomDouble());
            default: return new IsoscelesTrapezoid(randomColor,
                    randomDouble(),
                    randomDouble(),
                    randomDouble());
        }
    }

    public double randomDouble() {
        return random.nextDouble(MAX_RANDOM_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
