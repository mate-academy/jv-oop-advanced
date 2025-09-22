package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }

    private int randomValue() {
        return 1 + RANDOM.nextInt(10);
    }

    public Figure getRandomFigure() {
        int randomFigure = RANDOM.nextInt(5);

        if (randomFigure == 0) {
            return new Square(colorSupplier.getRandomColor(), randomValue());
        } else if (randomFigure == 1) {
            return new Rectangle(colorSupplier.getRandomColor(), randomValue(), randomValue());
        } else if (randomFigure == 2) {
            return new RightTriangle(colorSupplier.getRandomColor(), randomValue(), randomValue());
        } else if (randomFigure == 3) {
            return new Circle(colorSupplier.getRandomColor(), randomValue());
        } else {
            return new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    randomValue(),
                    randomValue(),
                    randomValue());
        }
    }

}
