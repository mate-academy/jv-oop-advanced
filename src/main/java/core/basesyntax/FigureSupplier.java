package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 5;
    private static final int MIN_VALUE = 2;
    private static final int UNITS = 5;
    private static final int DEFAULT_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(UNITS);
        switch (number) {
            case 0: return new Circle(colorSupplier.getRandomColor().toLowerCase(),
                    random.nextInt(MAX_VALUE) + MIN_VALUE);
            case 1: return new Square(colorSupplier.getRandomColor().toLowerCase(),
                    random.nextInt(MAX_VALUE) + MIN_VALUE);
            case 2: return new Rectangle(colorSupplier.getRandomColor().toLowerCase(),
                    random.nextInt(MAX_VALUE) + MIN_VALUE,
                    random.nextInt(MAX_VALUE) + MIN_VALUE);
            case 3: return new RightTriangle(colorSupplier.getRandomColor().toLowerCase(),
                    random.nextInt(MAX_VALUE) + MIN_VALUE,
                    random.nextInt(MAX_VALUE) + MIN_VALUE);
            case 4: return new IsoscelesTrapezoid(colorSupplier.getRandomColor().toLowerCase(),
                    random.nextInt(MAX_VALUE) + MIN_VALUE,
                    random.nextInt(MAX_VALUE) + MIN_VALUE,
                    random.nextInt(MAX_VALUE) + MIN_VALUE);
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_SIZE);
    }
}
