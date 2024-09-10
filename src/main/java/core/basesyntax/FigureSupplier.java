package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int NUMBER_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public BaseShape getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double squareSide = random.nextDouble() * 10;
                return new Square(color, squareSide);
            case 1:
                double rectangleWidth = random.nextDouble() * 10;
                double rectangleHeight = random.nextDouble() * 10;
                return new Rectangle(color, rectangleWidth, rectangleHeight);
            case 2:
                double triangleBase = random.nextDouble() * 10;
                double triangleHeight = random.nextDouble() * 10;
                return new RightTriangle(color, triangleBase, triangleHeight);
            case 3:
                double circleRadius = random.nextDouble() * 10;
                return new Circle(color, circleRadius);
            case 4:
            default:
                double trapezoidUpperBase = random.nextDouble() * 10;
                double trapezoidLowerBase = random.nextDouble() * 10;
                double trapezoidHeight = random.nextDouble() * 10;
                return new IsoscelesTrapezoid(color,
                        trapezoidUpperBase,
                        trapezoidLowerBase,
                        trapezoidHeight);
        }
    }

    public BaseShape getDefaultFigure() {
        return new Circle("white", DEFAULT_RADIUS);
    }
}
