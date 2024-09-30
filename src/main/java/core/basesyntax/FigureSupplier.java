package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_VALUE = 10;
    private static final int AMOUNT_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(1, AMOUNT_OF_FIGURES + 1);
        return switch (randomNumber) {
            case 1 -> new Circle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(MAX_VALUE)
            );
            case 2 -> new Square(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(MAX_VALUE)
            );
            case 3 -> new Rectangle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(MAX_VALUE),
                    random.nextDouble(MAX_VALUE)
            );
            case 4 -> new RightTriangle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(MAX_VALUE),
                    random.nextDouble(MAX_VALUE)
            );
            case 5 -> new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(MAX_VALUE),
                    random.nextDouble(MAX_VALUE),
                    random.nextDouble(MAX_VALUE)
            );
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
