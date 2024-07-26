package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier color = new ColorSupplier();
    private static final Random random = new Random();
    private static final FigureList[] figures = FigureList.values();
    private static final double RANDOM_MAX_VALUE = 5.1;
    private static final double DEFAULT_CIRCLE_RADIUS = 10;

    public Figure getRandomFigure() {
        Figure figure = null;

        switch (randomiseFigureType()) {
            case CIRCLE:
                figure = new Circle(color.getRandomColor(), random.nextDouble(RANDOM_MAX_VALUE));
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(color.getRandomColor(),
                        random.nextDouble(RANDOM_MAX_VALUE), random.nextDouble(RANDOM_MAX_VALUE),
                        random.nextDouble(RANDOM_MAX_VALUE));
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(color.getRandomColor(),
                        random.nextDouble(RANDOM_MAX_VALUE), random.nextDouble(RANDOM_MAX_VALUE));
                break;
            case RECTANGLE:
                figure = new Rectangle(color.getRandomColor(), random.nextDouble(RANDOM_MAX_VALUE),
                        random.nextDouble(RANDOM_MAX_VALUE));
                break;
            case SQUARE:
                figure = new Square(color.getRandomColor(), random.nextDouble(RANDOM_MAX_VALUE));
                break;
            default:
                getDefaultFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }

    private FigureList randomiseFigureType() {
        return figures[random.nextInt(figures.length)];
    }
}
