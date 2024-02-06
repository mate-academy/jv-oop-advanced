package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 4;
    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_AMOUNT);
        switch (index) {
            case 0: {
                return new Square(ColorSupplier.getRandomColor(),
                                                random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 1: {
                return new Rectangle(ColorSupplier.getRandomColor(),
                                                random.nextInt(MAX_RANDOM_NUMBER),
                                                random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 2: {
                return new RightTriangle(ColorSupplier.getRandomColor(),
                                                random.nextInt(MAX_RANDOM_NUMBER),
                                                random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 3: {
                return new Circle(ColorSupplier.getRandomColor(),
                                                random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 4: {
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                                                random.nextInt(MAX_RANDOM_NUMBER),
                                                random.nextInt(MAX_RANDOM_NUMBER),
                                                random.nextInt(MAX_RANDOM_NUMBER));
            }
            default: {
                return getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
