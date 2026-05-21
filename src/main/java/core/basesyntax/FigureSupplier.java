package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 100;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);

        Color color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(
                        color,
                        random.nextInt(MAX_RANDOM_NUMBER) + 1
                );

            case 1:
                return new Rectangle(
                        color,
                        random.nextInt(MAX_RANDOM_NUMBER) + 1,
                        random.nextInt(MAX_RANDOM_NUMBER) + 1
                );

            case 2:
                return new Circle(
                        color,
                        random.nextInt(MAX_RANDOM_NUMBER) + 1
                );

            case 3:
                return new RightTriangle(
                        color,
                        random.nextInt(MAX_RANDOM_NUMBER) + 1,
                        random.nextInt(MAX_RANDOM_NUMBER) + 1
                );

            case 4:
                return new IsoscelesTrapezoid(
                        color,
                        random.nextInt(MAX_RANDOM_NUMBER) + 1,
                        random.nextInt(MAX_RANDOM_NUMBER) + 1,
                        random.nextInt(MAX_RANDOM_NUMBER) + 1
                );

            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.BLUE, 10);
    }
}
