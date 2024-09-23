package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                double squareSide = random.nextDouble() * MAX_VALUE;
                return new Square(color, squareSide);
            case 1:
                double rectangleWidth = random.nextDouble() * MAX_VALUE;
                double rectangleHeight = random.nextDouble() * MAX_VALUE;
                return new Rectangle(color, rectangleWidth, rectangleHeight);
            case 2:
                double triangleFirstLeg = random.nextDouble() * MAX_VALUE;
                double triangleSecondLeg = random.nextDouble() * MAX_VALUE;
                return new RightTriangle(color, triangleFirstLeg, triangleSecondLeg);
            case 3:
                double circleRadius = random.nextDouble() * MAX_VALUE;
                return new Circle(color, circleRadius);
            default:
                double trapezoidUpperBase = random.nextDouble() * MAX_VALUE;
                double trapezoidBottomBase = random.nextDouble() * MAX_VALUE;
                double trapezoidHeight = random.nextDouble() * MAX_VALUE;
                return new IsoscelesTrapezoid(color, trapezoidUpperBase,
                        trapezoidBottomBase, trapezoidHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
