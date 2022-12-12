package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), getSideOfFigure());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), getSideOfFigure());
            case TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getSideOfFigure(), getSideOfFigure());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                         getSideOfFigure(), getSideOfFigure());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getSideOfFigure(), getSideOfFigure(), getSideOfFigure());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR.name(), DEFAULT_CIRCLE_RADIUS);
    }

    private int getSideOfFigure() {
        return random.nextInt(MAX_VALUE);
    }
}
