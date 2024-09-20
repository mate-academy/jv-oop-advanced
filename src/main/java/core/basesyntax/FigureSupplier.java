package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Figure defaultFigure = new Circle(Color.WHITE, 10);
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final double maxValue = 10;
    private final int amountOfFigures = 5;

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(1, amountOfFigures + 1);
        return switch (randomNumber) {
            case 1 -> new Circle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(maxValue)
            );
            case 2 -> new Square(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(maxValue)
            );
            case 3 -> new Rectangle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(maxValue),
                    random.nextDouble(maxValue)
            );
            case 4 -> new RightTriangle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(maxValue),
                    random.nextDouble(maxValue)
            );
            case 5 -> new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    random.nextDouble(maxValue),
                    random.nextDouble(maxValue),
                    random.nextDouble(maxValue),
                    random.nextDouble(maxValue)
            );
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
