package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final double MAX_SIZE = 10.0;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10.0;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        RANDOM.nextDouble() * MAX_SIZE);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        RANDOM.nextDouble() * MAX_SIZE,
                        RANDOM.nextDouble() * MAX_SIZE);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        RANDOM.nextDouble() * MAX_SIZE,
                        RANDOM.nextDouble() * MAX_SIZE);
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        RANDOM.nextDouble() * MAX_SIZE);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        RANDOM.nextDouble() * MAX_SIZE,
                        RANDOM.nextDouble() * MAX_SIZE,
                        RANDOM.nextDouble() * MAX_SIZE);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
