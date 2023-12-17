package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_LENGTH_OF_SEGMENT = 20;
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble());
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH_OF_SEGMENT));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH_OF_SEGMENT),
                        random.nextInt(MAX_LENGTH_OF_SEGMENT));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble(),
                        random.nextInt(MAX_LENGTH_OF_SEGMENT));
            default:
                break;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
