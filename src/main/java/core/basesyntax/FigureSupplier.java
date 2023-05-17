package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_COUNT_FIGURES = 5;
    private static final int MAX_LENGTH = 20;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_COUNT_FIGURES);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH));
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            case 3:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_LENGTH));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
