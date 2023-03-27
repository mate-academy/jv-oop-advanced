package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final String color = colorSupplier.getRandomColor();
        final int INDEX = random.nextInt(5);
        final int RANDOM_LENGTH_1 = random.nextInt(100);
        final int RANDOM_LENGTH_2 = random.nextInt(100);
        final int RANDOM_LENGTH_3 = random.nextInt(100);

        switch (INDEX) {
            case 0:
                return new Circle(RANDOM_LENGTH_1, color);
            case 1:
                return new IsoscelesTrapezoid(RANDOM_LENGTH_1, RANDOM_LENGTH_2,
                        RANDOM_LENGTH_3, color);
            case 2:
                return new Rectangle(RANDOM_LENGTH_1, RANDOM_LENGTH_2, color);
            case 3:
                return new RightTriangle(RANDOM_LENGTH_1, RANDOM_LENGTH_2, color);
            default:
                return new Square(RANDOM_LENGTH_1, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString());
    }
}
