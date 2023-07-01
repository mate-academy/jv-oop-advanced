package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final FigureEnum DEFAULT_FIGURE_NAME = FigureEnum.CIRCLE;
    public static final double DEFAULT_CIRCLE_RADIUS = 10;
    public static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    public static final int MAX_FIGURES = 6;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FigureEnum.values().length);
        FigureEnum defaultFigureName = FigureEnum.values()[randomFigure];
        return getFigure(defaultFigureName);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_NAME, DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }

    private Figure getFigure(FigureEnum figure) {
        switch (figure) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), getRandomValue());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomValue(),
                        getRandomValue());
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), getRandomValue());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue(), getRandomValue());
            default:
                throw new IllegalArgumentException("Incorrect type of figure");
        }
    }

    private double getRandomValue() {
        return random.nextInt(MAX_FIGURES);
    }
}

