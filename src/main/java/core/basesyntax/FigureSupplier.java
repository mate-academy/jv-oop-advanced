package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        Color color = Color.valueOf(colorSupplier.getRandomColor());

        switch (figureIndex) {
            case 0:
                return new Square(random.nextInt(100), color);
            case 1:
                return new Rectangle(random.nextInt(100), random.nextInt(100), color);
            case 2:
                return new RightTriangle(random.nextInt(100), random.nextInt(100), color);
            case 3:
                return new IsoscelesTrapezoid(random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), color);
            case 4:
            default:
                return new Circle(random.nextInt(100), color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }
}
