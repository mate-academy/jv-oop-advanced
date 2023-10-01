package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int numberOfFigureTypes = 5;
    private static final double MAX_RANDOM_RADIUS = 0;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Color randomColor = colorSupplier.getRandomColor();
        int figureType = random.nextInt(numberOfFigureTypes);

        switch (figureType) {
            case 0:
                double sideLength = random.nextDouble() * 10 + 1;
                return prepareSquare(randomColor);

            case 1:
                double width = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return prepareRectangle(randomColor, width, height);

            case 2:
                double firstLeg = random.nextDouble() * 10 + 1;
                double secondLeg = random.nextDouble() * 10 + 1;
                return prepareRightTriangle(randomColor, firstLeg, secondLeg);

            case 3:
                double radius = random.nextDouble() * 10 + 1;
                return prepareCircle(randomColor, radius);

            case 4:
                double base1 = random.nextDouble() * 10 + 1;
                double base2 = random.nextDouble() * 10 + 1;
                double trapezoidHeight = random.nextDouble() * 10 + 1;
                return prepareIsoscelesTrapezoid(randomColor, base1, base2, trapezoidHeight);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure prepareSquare(Color color) {
        return new Square(color, getRandomRadius());
    }

    public double getRandomRadius() {
        return random.nextDouble() * MAX_RANDOM_RADIUS + 1;
    }

    private Figure prepareRectangle(Color color, double width, double height) {
        return new Rectangle(color, width, height);
    }

    private Figure prepareRightTriangle(Color color, double firstLeg, double secondLeg) {
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure prepareCircle(Color color, double radius) {
        return new Circle(color, radius);
    }

    private Figure prepareIsoscelesTrapezoid(Color color, double base1,
                                             double base2, double trapezoidHeight) {
        return new IsoscelesTrapezoid(color, base1,
                base2, trapezoidHeight);
    }

}
