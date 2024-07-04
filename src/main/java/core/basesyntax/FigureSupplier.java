package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final double MAX_SIZE = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomValue = RANDOM.nextInt(5);
        if (randomValue == 0) {
            return new Square(colorSupplier.getRandomColor(), RANDOM.nextDouble() * MAX_SIZE);
        } else if (randomValue == 1) {
            return new Rectangle(colorSupplier.getRandomColor(), RANDOM.nextDouble() * MAX_SIZE, RANDOM.nextDouble() * MAX_SIZE);
        } else if (randomValue == 2) {
            return new RightTriangle(colorSupplier.getRandomColor(), RANDOM.nextDouble() * MAX_SIZE, RANDOM.nextDouble() * MAX_SIZE);
        } else if (randomValue == 3) {
            return new Circle(colorSupplier.getRandomColor(), RANDOM.nextDouble() * MAX_SIZE);
        } else if (randomValue == 4) {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), RANDOM.nextDouble() * MAX_SIZE, RANDOM.nextDouble() * MAX_SIZE, RANDOM.nextDouble() * MAX_SIZE);
        } else {
            return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }
}
