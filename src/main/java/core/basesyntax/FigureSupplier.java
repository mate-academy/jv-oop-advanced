package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 5;
    private static final int MIN_VALUE = 2;
    private static final int UNITS = 5;
    private static final int AMOUNT = 3;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number;
        Figure figure = null;
        for (int i = 0; i < AMOUNT; i++) {
            number = random.nextInt(UNITS);
            switch (number) {
                case 0: figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE) + MIN_VALUE);
                break;
                case 1: figure = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE) + MIN_VALUE);
                break;
                case 2: figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE) + MIN_VALUE,
                        random.nextInt(MAX_VALUE) + MIN_VALUE);
                break;
                case 3: figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE) + MIN_VALUE,
                        random.nextInt(MAX_VALUE) + MIN_VALUE);
                break;
                case 4: figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE) + MIN_VALUE,
                        random.nextInt(MAX_VALUE) + MIN_VALUE,
                        random.nextInt(MAX_VALUE) + MIN_VALUE);
                break;
                default:
            }
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.white.name(), 10);
    }
}
