package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBERS = 5;
    private static final String COLOR = Color.WHITE.name();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(NUMBERS);
        switch (choice) {
            case 0:
                int squareSide = random.nextInt(10) + 1;
                return new Square(squareSide, colorSupplier.getRandomColor());
            case 1:
                int rectLength = random.nextInt(10) + 1;
                int rectWidth = random.nextInt(10) + 1;
                return new Rectangle(rectLength, rectWidth, colorSupplier.getRandomColor());
            case 2:
                int triFirstLeg = random.nextInt(10) + 1;
                int triSecondLeg = random.nextInt(10) + 1;
                return new RightTriangle(triFirstLeg, triSecondLeg, colorSupplier.getRandomColor());
            case 3:
                int circleRadius = random.nextInt(10) + 1;
                return new Circle(circleRadius, colorSupplier.getRandomColor());
            case 4:
                return prepareIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        int trapezoidUpperBase = random.nextInt(10) + 1;
        int trapezoidLowerBase = random.nextInt(10) + 1;
        int trapezoidHeight = random.nextInt(10) + 1;
        return new IsoscelesTrapezoid(trapezoidUpperBase, trapezoidLowerBase, trapezoidHeight,
                colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, COLOR);
    }
}
