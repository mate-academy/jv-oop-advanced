package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_NAME = "Circle";
    private static final String DEFAULT_COLOR = Colors.WHITE.name();
    private static final double DEFAULT_RADIUS = 10;
    private static final int COUNT_OF_FIGURES = 5;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 16;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(COUNT_OF_FIGURES);

        switch (figureNumber) {
            case 0:
                return new Square("Square", colorSupplier.getRandomColor(),
                    random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            case 1:
                return new Rectangle("Rectangle", colorSupplier.getRandomColor(),
                    random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH,
                    random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            case 2:
                return new RightTriangle("RightTriangle", colorSupplier.getRandomColor(),
                    random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH,
                    random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            case 3:
                return new Circle("Circle", colorSupplier.getRandomColor(),
                    random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            case 4:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", colorSupplier.getRandomColor(),
                    random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH,
                    random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH,
                    random.nextInt(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_NAME, DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
