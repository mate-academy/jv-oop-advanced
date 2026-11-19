package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        switch (figureType) {
            case 0:
                return new Circle(
                        colorSupplier.getRandomColor().name(),
                        random.nextInt(MAX_SIZE) + 1
                );
            case 1:
                return new Square(colorSupplier.getRandomColor().name(),
                        random.nextInt(MAX_SIZE) + 1);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor().name(),
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1);

            case 3:
                return new RightTriangle(colorSupplier.getRandomColor().name(),
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1);

            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor().name(),
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("RED", MAX_SIZE);
    }
}
