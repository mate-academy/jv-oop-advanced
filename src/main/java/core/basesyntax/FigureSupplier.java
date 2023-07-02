package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int RADIUS = 10;
    public static final int UPPER_LIMIT = 100;

    private Random random = new Random();
    private Circle circle = new Circle(Color.WHITE.name(), RADIUS);

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),random.nextInt(UPPER_LIMIT));
            case 1:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(UPPER_LIMIT),
                        random.nextInt(UPPER_LIMIT),
                        random.nextInt(UPPER_LIMIT));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(UPPER_LIMIT),
                        random.nextInt(UPPER_LIMIT));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(UPPER_LIMIT),
                        random.nextInt(UPPER_LIMIT));
            case 4:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(UPPER_LIMIT));
            default:
                return circle;
        }
    }

    public Figure getDefaultFigure() {
        return circle;
    }
}
