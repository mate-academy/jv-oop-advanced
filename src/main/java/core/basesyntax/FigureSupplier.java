package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_AMOUNT = 4;
    public static final int UPPER_LENGTH = 10;
    public static final int DEFAULT_RADIUS_UPPER_LENGTH = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_AMOUNT);
        switch (index) {
            case 0: {
                return new Square(ColorSupplier.getRandomColor(),
                                                random.nextInt(UPPER_LENGTH));
            }
            case 1: {
                return new Rectangle(ColorSupplier.getRandomColor(),
                                                random.nextInt(UPPER_LENGTH),
                                                random.nextInt(UPPER_LENGTH));
            }
            case 2: {
                return new RightTriangle(ColorSupplier.getRandomColor(),
                                                random.nextInt(UPPER_LENGTH),
                                                random.nextInt(UPPER_LENGTH));
            }
            case 3: {
                return new Circle(ColorSupplier.getRandomColor(),
                                                random.nextInt(UPPER_LENGTH));
            }
            case 4: {
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                                                random.nextInt(UPPER_LENGTH),
                                                random.nextInt(UPPER_LENGTH),
                                                random.nextInt(UPPER_LENGTH));
            }
            default: {
                return getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS_UPPER_LENGTH);
    }
}
