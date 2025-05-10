package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_SIZE = 10;
    private static final int DEFAULT_VALUE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int values = random.nextInt(NUMBER_OF_FIGURES);
        switch (values) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            default:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_VALUE);
    }
}
