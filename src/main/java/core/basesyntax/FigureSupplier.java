package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = Figures.values().length;
    private static final int MAX_PARAMETER = 25;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (Figures.values()[figureNumber]) {
            case SQUARE:
                return new Square(random.nextInt(MAX_PARAMETER) + 1,
                        colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextInt(MAX_PARAMETER) + 1,
                        random.nextInt(MAX_PARAMETER) + 1,
                        colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextInt(MAX_PARAMETER) + 1,
                        random.nextInt(MAX_PARAMETER) + 1,
                        colorSupplier.getRandomColor());
            case CIRCLE:
                return new Circle(random.nextInt(MAX_PARAMETER) + 1,
                        colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextInt(MAX_PARAMETER) + 1,
                        random.nextInt(MAX_PARAMETER) + 1,
                        random.nextInt(MAX_PARAMETER) + 1,
                        colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.name());
    }
}
