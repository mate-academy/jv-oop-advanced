package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES_TYPES = 5;
    private static final int SIZE_LIMIT = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private int getRandomSize() {
        return random.nextInt(SIZE_LIMIT) + 1;
    }

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        int sideA = getRandomSize();
        switch (random.nextInt(MAX_FIGURES_TYPES) + 1) {
            case 1:
                return new Circle(sideA, randomColor);
            case 2:
                return new Square(sideA, randomColor);
            case 3:
                int rectangleSideB = getRandomSize();
                return new Rectangle(sideA, rectangleSideB, randomColor);
            case 4:
                int triangleSideB = getRandomSize();
                return new RightTriangle(sideA, triangleSideB, randomColor);
            case 5:
                int trapezoidSideB = getRandomSize();
                int trapezoidHeight = getRandomSize();
                return new IsoscelesTrapezoid(sideA, trapezoidSideB, trapezoidHeight, randomColor);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE);
    }
}
