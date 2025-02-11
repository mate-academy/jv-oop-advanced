package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int maxRandomValue = 20;
    private final int defaultRadius = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        switch (index) {
            case 0: return new Circle(colorSupplier.getRandomColor(),
                    random.nextDouble(maxRandomValue));
            case 1: return new Square(colorSupplier.getRandomColor(),
                    random.nextDouble(maxRandomValue));
            case 2: return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextDouble(maxRandomValue),
                    random.nextDouble(maxRandomValue));
            case 3: return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble(maxRandomValue),
                    random.nextDouble(maxRandomValue));
            default: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble(maxRandomValue),
                    random.nextDouble(maxRandomValue),
                    random.nextDouble(maxRandomValue));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), defaultRadius);
    }
}
