package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int TOTAL_FIGURE = 5;
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int DEFAULT_RADIUS = 10;
    public static final int LIMIT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureName indexOfFigure = FigureName.values()[random.nextInt(TOTAL_FIGURE)];
        switch (indexOfFigure) {
            case SQUARE: return new Square(colorSupplier.getRandomColor(), random.nextInt(LIMIT));
            case RECTANGLE: return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(LIMIT),
                    random.nextInt(LIMIT));
            case RIGHT_TRIANGLE: return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(LIMIT),
                    random.nextInt(LIMIT));
            case CIRCLE: return new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(LIMIT));
            case ISOSCELES_TRAPEZOID: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(LIMIT),
                    random.nextInt(LIMIT),
                    random.nextInt(LIMIT));
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
