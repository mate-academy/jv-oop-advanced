package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_VALUE = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_VALUE = 15;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(NUMBER_OF_FIGURES);
        int first = random.nextInt(MAX_VALUE);
        switch (number) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), first);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), first,
                        random.nextInt(MAX_VALUE));
            case 2:
                return new Square(colorSupplier.getRandomColor(), first);
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), first,
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            default:
                return new RightTriangle(colorSupplier.getRandomColor(), first,
                        random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_VALUE);
    }
}
