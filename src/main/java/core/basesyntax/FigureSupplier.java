package core.basesyntax;

import java.util.Random;

public class FigureSupplier implements IFigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int MAX_LENGTH = 100;
    private static final int MIN_LENGTH = 1;
    private static final int RADIUS_OF_BASE_CIRCLE = 10;

    @Override
    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURE)) {
            case 0: {
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            }
            case 1: {
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH,
                        random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            }
            case 2: {
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH,
                        random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            }
            case 3: {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH,
                        random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH,
                        random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            }
            default: {
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            }
        }
    }

    @Override
    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), RADIUS_OF_BASE_CIRCLE);
    }
}
