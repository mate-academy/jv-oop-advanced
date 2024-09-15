package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIZE = 100.0; // Максимальный размер фигуры
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        int randomValue = random.nextInt(5);
        if (randomValue == 0) {
            return new Square(colorSupplier.getRandomColor(), random.nextDouble() * MAX_SIZE);
        } else if (randomValue == 1) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_SIZE,
                    random.nextDouble() * MAX_SIZE);
        } else if (randomValue == 2) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_SIZE,
                    random.nextDouble() * MAX_SIZE);
        } else if (randomValue == 3) {
            return new Circle(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_SIZE);
        } else if (randomValue == 4) {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_SIZE,
                    random.nextDouble() * MAX_SIZE,
                    random.nextDouble() * MAX_SIZE);
        } else {
            return getDefaultFigure();
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle("white", 10.0);
    }
}
