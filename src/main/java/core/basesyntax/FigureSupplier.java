package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    public static final int MAX_SIZE = 100;
    public static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureType) {
            case 1:
                return new Circle(random.nextInt(MAX_SIZE), colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIZE),random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE), colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
            case 4:
                return new RightTriangle(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
            default:
                return new Square(random.nextInt(MAX_SIZE), colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR.getColor());
    }
}
