package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final String defaultColor = ColorSupplier.Color.WHITE.toString();
    private final int defaultRadius = 10;

    public Figures getRandomFigure() {
        Figures figure;
        Random random = new Random();
        Shape shape = Shape.values()[random.nextInt(Shape.values().length)];
        String color = new ColorSupplier().getRandomColor();
        int firstSize = random.nextInt(Figures.MAX_SIDE);
        switch (shape) {
            case CIRCLE:
                figure = new Circle(color, firstSize);
                break;
            case SQUARE:
                figure = new Square(color, firstSize);
                break;
            case RECTANGLE:
                figure = new Rectangle(color, firstSize, random.nextInt(Figures.MAX_SIDE));
                break;
            case TRIANGLE:
                figure = new RightTriangle(color, firstSize);
                break;
            case TRAPEZOID:
                figure = new IsoscelesTrapezoid(color, firstSize, random.nextInt(Figures.MAX_SIDE),
                        random.nextInt(Figures.MAX_SIDE));
                break;
            default:
                figure = null;
        }
        return figure;
    }

    public Figures getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }

    private enum Shape { CIRCLE, SQUARE, RECTANGLE, TRIANGLE, TRAPEZOID }
}
