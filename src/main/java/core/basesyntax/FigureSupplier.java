package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Color randomColor = Color.getRandomColor();
        int numberOfFigureTypes = 5;
        int figureType = random.nextInt(numberOfFigureTypes);

        switch (figureType) {
            case 0:
                double sideLength = random.nextDouble() * 10 + 1;
                return prepareSquare(randomColor, sideLength);

            case 1:
                double width = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new Rectangle(randomColor, width, height);

            case 2:
                double firstLeg = random.nextDouble() * 10 + 1;
                double secondLeg = random.nextDouble() * 10 + 1;
                return new RightTriangle(randomColor, firstLeg, secondLeg);

            case 3:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(randomColor, radius);

            case 4:
                double topBase = random.nextDouble() * 10 + 1;
                double bottomBase = random.nextDouble() * 10 + 1;
                double trapezoidHeight = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, trapezoidHeight);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure prepareSquare(Color color, double sideLength) {
        return new Square(color, sideLength);
    }
}
