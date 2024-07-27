package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier color = new ColorSupplier();
    private static final Random random = new Random();
    private static final FigureType[] figures = FigureType.values();
    private static final double RANDOM_MAX_VALUE = 5.1;
    private static final double DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();

    public Figure getRandomFigure() {
        Figure figure = null;

        switch (randomiseFigureType()) {
            case CIRCLE:
                figure = getCircle();
                break;
            case ISOSCELES_TRAPEZOID:
                figure = getIsoscelesTrapezoidFigure();
                break;
            case RIGHT_TRIANGLE:
                figure = getRightTriangle();
                break;
            case RECTANGLE:
                figure = getRectangle();
                break;
            case SQUARE:
                figure = getSquare();
                break;
            default:
                getDefaultFigure();
        }
        return figure;
    }

    private Figure getSquare() {
        return new Square(color.getRandomColor(),
                random.nextDouble(RANDOM_MAX_VALUE));
    }

    private Figure getRectangle() {
        return new Rectangle(color.getRandomColor(),
                random.nextDouble(RANDOM_MAX_VALUE),
                random.nextDouble(RANDOM_MAX_VALUE));
    }

    private Figure getRightTriangle() {
        return new RightTriangle(color.getRandomColor(),
                random.nextDouble(RANDOM_MAX_VALUE),
                random.nextDouble(RANDOM_MAX_VALUE));
    }

    private Figure getIsoscelesTrapezoidFigure() {
        return new IsoscelesTrapezoid(color.getRandomColor(),
                random.nextDouble(RANDOM_MAX_VALUE),
                random.nextDouble(RANDOM_MAX_VALUE),
                random.nextDouble(RANDOM_MAX_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private FigureType randomiseFigureType() {
        return figures[random.nextInt(figures.length)];
    }

    private Figure getCircle() {
        return new Circle(color.getRandomColor(), random.nextDouble(RANDOM_MAX_VALUE));
    }
}
