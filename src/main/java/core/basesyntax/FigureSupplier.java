package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_BOUND = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randNum = random.nextInt(FIGURE_COUNT);
        switch (randNum) {
            case (0):
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_BOUND));
            case (1):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND));
            case (2):
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND));
            case (3):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND), random.nextInt(MAX_BOUND));
            case (4):
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_BOUND));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
