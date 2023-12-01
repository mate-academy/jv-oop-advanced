package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = "WHITE";
    private static final int BOUND = 10;//Setting Figure's side bound to avoid huge numbers
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        switch (index) {
            case 1:
                int squareSide = random.nextInt(BOUND) + 1;
                return new Square(squareSide, colorSupplier.getRandomColor());
            case 2:
                int rectangleHeight = random.nextInt(BOUND) + 1;
                int rectangleWidth = random.nextInt(BOUND) + 1;
                return new Rectangle(rectangleHeight, rectangleWidth,
                        colorSupplier.getRandomColor());
            case 3:
                int rightTriangleSide = random.nextInt(BOUND) + 1;
                int rightTriangleHeight = random.nextInt(BOUND) + 1;
                return new RightTriangle(rightTriangleSide, rightTriangleHeight,
                        colorSupplier.getRandomColor());
            case 4:
                int radius = random.nextInt(BOUND) + 1;
                return new Circle(radius, colorSupplier.getRandomColor());
            default:
                int isoHeight = random.nextInt(BOUND) + 1;
                int firstParallel = random.nextInt(BOUND) + 1;
                int secondParallel = random.nextInt(BOUND) + 1;
                return new IsoscelesTrapezoid(isoHeight, firstParallel, secondParallel,
                    colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
