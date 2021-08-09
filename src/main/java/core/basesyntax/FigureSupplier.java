package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MaxNumber = 100;
    private static final int MinNumber = 100;

    private static final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier newColour = new ColorSupplier();
        if (random.nextInt(4) == 0) {
            return new Square("square",
                    random.nextInt(MinNumber + (int) (Math.random() * MaxNumber)),
                    newColour.getRandomColor());
        } else if (random.nextInt(4) == 1) {
            return new Circle("circle",
                    random.nextInt(MinNumber + (int) (Math.random() * MaxNumber)),
                    newColour.getRandomColor());
        } else if (random.nextInt(4) == 2) {
            return new IsoscelesTrapezoid("isosceles trapezoid",
                    random.nextInt(MinNumber + (int) (Math.random() * MaxNumber)),
                    random.nextInt(MinNumber + (int) (Math.random() * MaxNumber)),
                    random.nextInt(MinNumber + (int) (Math.random() * MaxNumber)),
                    newColour.getRandomColor());
        } else if (random.nextInt(4) == 3) {
            return new RightTriangle("right triangle",
                    random.nextInt(MinNumber + (int) (Math.random() * MaxNumber)),
                    random.nextInt(MinNumber + (int) (Math.random() * MaxNumber)),
                    newColour.getRandomColor());
        }
        return new Rectangle("rectangle",
                random.nextInt(MinNumber + (int) (Math.random() * MaxNumber)),
                random.nextInt(MinNumber + (int) (Math.random() * MaxNumber)),
                newColour.getRandomColor());
    }
}
