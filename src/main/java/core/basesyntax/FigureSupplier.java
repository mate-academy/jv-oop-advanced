package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = "White";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return createRandomFigure(TypeOfFigure.values()[random
                .nextInt(TypeOfFigure.values().length)]);
    }

    public Figure createRandomFigure(TypeOfFigure types) {
        Figure figure;
        switch (types) {
            case CIRCLE :
                figure = new Circle(colorSupplier.getRandomColor(), random.nextInt());
                break;
            case SQUARE:
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt());
                break;
            case RECTANGLE:
                figure = new Rectangle(colorSupplier.getRandomColor(), random.nextInt(),
                        random.nextInt());
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(),
                        random.nextInt());
                break;
            default:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(),
                        random.nextInt(), random.nextInt());
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
