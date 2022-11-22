package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int MAX_RANDOM_VALUE = 50;
    static final int DEFAULT_FIGURE_VALUE = 10;
    static final String DEFAULT_FIGURE_COLOR = Color.WHITE.name();
    private final Random rnd = new Random();
    private final ColorSupplier color = new ColorSupplier();

    private int getRandomFigureValue() {
        return rnd.nextInt(MAX_RANDOM_VALUE) + 1;
    }

    public Figure getRandomFigure() {
        switch (FigureType.values()[rnd.nextInt(FigureType.values().length)]) {
            case SQUARE:
                int squareSide = getRandomFigureValue();
                String figureColor = color.getRandomColor();
                return new Square(squareSide, figureColor);
            case RECTANGLE:
                int rectangleSideA = getRandomFigureValue();
                int rectangleSideB = getRandomFigureValue();
                String rectangleColor = color.getRandomColor();
                return new Rectangle(rectangleSideA, rectangleSideB, rectangleColor);
            case TRIANGLE:
                int triangleHeight = getRandomFigureValue();
                int triangleBase = getRandomFigureValue();
                String triangleColor = color.getRandomColor();
                return new RightTriangle(triangleHeight, triangleBase, triangleColor);
            case TRAPEZOID:
                int sideA = getRandomFigureValue();
                int sideB = getRandomFigureValue();
                int height = getRandomFigureValue();
                String trapezoidColor = color.getRandomColor();
                return new IsoscelesTrapezoid(sideA, sideB, height, trapezoidColor);
            default:
                int circleRadius = getRandomFigureValue();
                String circleColor = color.getRandomColor();
                return new Circle(circleRadius, circleColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_VALUE, DEFAULT_FIGURE_COLOR);
    }
}
