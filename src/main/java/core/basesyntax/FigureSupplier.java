package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES_TYPES = 5;
    private static final int SIZE_LIMIT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        int figureIndex = random.nextInt(MAX_FIGURES_TYPES) + 1;
        int sideA = random.nextInt(SIZE_LIMIT) + 1;
        switch (figureIndex) {
            case 1:
                return new Circle(sideA, randomColor);
            case 2:
                return new Square(sideA, randomColor);
            case 3:
                int rectangleSideB = random.nextInt(SIZE_LIMIT) + 1;
                return new Rectangle(sideA, rectangleSideB, randomColor);
            case 4:
                int triangleSideB = random.nextInt(SIZE_LIMIT) + 1;
                return new RightTriangle(sideA, triangleSideB, randomColor);
            case 5:
                int trapezoidSideB = random.nextInt(SIZE_LIMIT) + 1;
                int trapezoidHeight = random.nextInt(SIZE_LIMIT) + 1;
                return new IsoscelesTrapezoid(sideA, trapezoidSideB, trapezoidHeight, randomColor);
            default:
                return new Figure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
