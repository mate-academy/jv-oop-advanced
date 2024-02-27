package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double RADIUS = 10;
    private static final Color COLOR = Color.WHITE;

    enum RandomFigure {
        CIRCLE,
        ISOSCELES_TRAPEZOID,
        RECTANGLE,
        RIGHT_TRIANGLE,
        SQUARE
    }

    private Random index = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (RandomFigure.values()[index.nextInt(RandomFigure.values().length)]) {
            case CIRCLE:
                return new Circle(color.getRandomColor(), index.nextDouble());
            case SQUARE:
                return new Square(color.getRandomColor(), index.nextDouble());
            case RECTANGLE:
                return new Rectangle(color.getRandomColor(), index.nextDouble(),
                        index.nextDouble());
            case RIGHT_TRIANGLE:
                return new RightTriangle(color.getRandomColor(), index.nextDouble(),
                        index.nextDouble());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color.getRandomColor(), index.nextDouble(),
                        index.nextDouble(), index.nextDouble());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR, RADIUS);
    }
}
