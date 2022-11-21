package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int MAX_RANDOM_VALUE = 50;
    static final int DEFAULT_FIGURE_VALUE = 10;
    static final String DEFAULT_FIGURE_COLOR = Colors.WHITE.name();
    private final Random rnd = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (FigureType.values()[rnd.nextInt(FigureType.values().length)]) {
            case SQUARE:
                int squareSide = rnd.nextInt(MAX_RANDOM_VALUE) + 1;
                String figureColor = color.getRandomColor();
                return new Square(squareSide, figureColor);
            case RECTANGLE:
                int rectangleSideA = rnd.nextInt(MAX_RANDOM_VALUE) + 1;
                int rectangleSideB = rnd.nextInt(MAX_RANDOM_VALUE) + 1;
                String rectangleColor = color.getRandomColor();
                return new Rectangle(rectangleSideA, rectangleSideB, rectangleColor);
            case TRIANGLE:
                int triangleHeight = rnd.nextInt(MAX_RANDOM_VALUE) + 1;
                int triangleBase = rnd.nextInt(MAX_RANDOM_VALUE) + 1;
                String triangleColor = color.getRandomColor();
                return new RightTriangle(triangleHeight, triangleBase, triangleColor);
            case TRAPEZOID:
                int sideA = rnd.nextInt(MAX_RANDOM_VALUE) + 1;
                int sideB = rnd.nextInt(MAX_RANDOM_VALUE) + 1;
                int height = rnd.nextInt(MAX_RANDOM_VALUE) + 1;
                String trapezoidColor = color.getRandomColor();
                return new IsoscelesTrapezoid(sideA, sideB, height, trapezoidColor);
            default:
                int circleRadius = rnd.nextInt(MAX_RANDOM_VALUE) + 1;
                String circleColor = color.getRandomColor();
                return new Circle(circleRadius, circleColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_VALUE, DEFAULT_FIGURE_COLOR);
    }
}
