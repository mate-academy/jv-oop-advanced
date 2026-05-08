package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final Double DEFAULT_CIRCLE_RADIUS = 10.0;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final String DEFAULT_CIRCLE_COLOR = FigureColor.WHITE.name().toLowerCase();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                Double radius = random.nextDouble();
                return new Circle(radius, colorSupplier.getRandomColor());
            case RECTANGLE:
                Double width = random.nextDouble();
                Double height = random.nextDouble();
                return new Rectangle(width, height, colorSupplier.getRandomColor());
            case SQUARE:
                Double side = random.nextDouble();
                return new Square(side, colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                Double firstLeg = random.nextDouble();
                Double secondLeg = random.nextDouble();
                return new RightTriangle(firstLeg, secondLeg, colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                Double shortBase = random.nextDouble();
                Double longBase = random.nextDouble();
                Double legsLength = random.nextDouble();
                Double trapezoidHeight = random.nextDouble();
                Double baseAngle = random.nextDouble();
                return new IsoscelesTrapezoid(shortBase, longBase, legsLength,
                        trapezoidHeight, baseAngle, colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
