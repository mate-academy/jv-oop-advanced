package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final String FIGURE_DEFAULT_COLOR = Colors.WHITE.name();
    private final int FIGURE_DEFAULT_RADIUS = 10;
    private final int MAX_FIGURE_NUMBER = 4;
    private final int MIN_SIZE_VALUE = 1;
    private final int MAX_SIZE_VALUE = 30;
    private Random random = new Random();

    public Figure getRandomFigure() {
        String figureColor = colorSupplier.getRandomColor();

        switch (random.nextInt(MAX_FIGURE_NUMBER)) {
            case 0 -> {
                return new Circle(figureColor, random.nextDouble(MIN_SIZE_VALUE, MAX_SIZE_VALUE));
            }
            case 1 -> {
                return new IsoscelesTrapezoid(figureColor,
                        random.nextDouble(MIN_SIZE_VALUE, MAX_SIZE_VALUE),
                        random.nextDouble(MIN_SIZE_VALUE, MAX_SIZE_VALUE),
                        random.nextDouble(MIN_SIZE_VALUE, MAX_SIZE_VALUE));
            }
            case 2 -> {
                return new Rectangle(figureColor,
                        random.nextDouble(MIN_SIZE_VALUE, MAX_SIZE_VALUE),
                        random.nextDouble(MIN_SIZE_VALUE, MAX_SIZE_VALUE));
            }
            case 3 -> {
                return new RightTriangle(figureColor,
                        random.nextDouble(MIN_SIZE_VALUE, MAX_SIZE_VALUE),
                        random.nextDouble(MIN_SIZE_VALUE, MAX_SIZE_VALUE));
            }
            default -> {
                return new Square(figureColor,
                        random.nextDouble(MIN_SIZE_VALUE, MAX_SIZE_VALUE));
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(FIGURE_DEFAULT_COLOR, FIGURE_DEFAULT_RADIUS);
    }
}
