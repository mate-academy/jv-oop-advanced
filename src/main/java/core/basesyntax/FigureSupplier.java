package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_DIMENSION = 10;
    private static final int DEFAULT_FIGURE_RADIUS = 10;
    private static final int MAX_FIGURES = 5;
    private static final String CIRCLE_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureType = random.nextInt(MAX_FIGURES);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return createSquare();
            case 1:
                return createRightTriangle();
            case 2:
                return createRectangle();
            case 3:
                return createIsoscelesTrapezoid();
            case 4:
                return createCircle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_RADIUS, CIRCLE_COLOR);
    }

    public int getRandomParameter() {
        return (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION;
    }

    private Circle createCircle() {
        int radius = getRandomParameter();
        String color = colorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    private Square createSquare() {
        int side = getRandomParameter();
        String color = colorSupplier.getRandomColor();
        return new Square(side, color);
    }

    private RightTriangle createRightTriangle() {
        int firstLeg = getRandomParameter();
        int secondLeg = getRandomParameter();
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Rectangle createRectangle() {
        int width = getRandomParameter();
        int height = getRandomParameter();
        String color = colorSupplier.getRandomColor();
        return new Rectangle(width, height, color);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        int firstBase = getRandomParameter();
        int secondBase = getRandomParameter();
        int height = getRandomParameter();
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(firstBase, secondBase, height, color);
    }
}
