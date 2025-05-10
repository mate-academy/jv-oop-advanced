package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 10;
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Circle circle = new Circle(Color.WHITE.name(), 10);

    public Figure getRandomFigure() {
        int randomFigurre = random.nextInt(FIGURE_COUNT);
        switch (randomFigurre) {
            case 0:
                return new Rectangle(
            colorSupplier.getRandomColor(),
                    random.nextInt(MAX_NUMBER) + 1,
                    random.nextInt(MAX_NUMBER) + 1
        );
            case 1:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1,
                        random.nextInt(MAX_NUMBER) + 1
                );
            case 2:
                return new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1
                );
            case 3:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1
                );
            case 4:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER) + 1,
                        random.nextInt(MAX_NUMBER) + 1,
                        random.nextInt(MAX_NUMBER) + 1
                );
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return circle;
    }
}
