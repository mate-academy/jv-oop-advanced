package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAX_SIDE = 10;
    public static final int MAX_HEIGHT = 10;
    public static final int MAX_TRAPEZOID_ALPHA = 45;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Square(random.nextInt(MAX_SIDE), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(MAX_SIDE), random.nextInt(MAX_HEIGHT),
                        colorSupplier.getRandomColor());
            case 2:
                return new Circle(random.nextInt(MAX_SIDE), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(MAX_SIDE), random.nextInt(MAX_HEIGHT),
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIDE), random.nextInt(MAX_HEIGHT),
                        random.nextInt(MAX_TRAPEZOID_ALPHA), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
