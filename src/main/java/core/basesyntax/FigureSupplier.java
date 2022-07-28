package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int CIRCLE_RADIUS = 6;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(50) + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(50) + 1,
                        random.nextInt(50) + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(50) + 1,
                        random.nextInt(50) + 1);
            case 3:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(50) + 1);
            case 4:
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(50) + 1,
                        random.nextInt(50) + 1,
                        random.nextInt(50) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), CIRCLE_RADIUS);
    }
}
