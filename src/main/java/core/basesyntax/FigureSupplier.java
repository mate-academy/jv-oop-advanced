package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                Double radius = random.nextDouble();
                return new Circle(radius, ColorSupplier.getRandomColor());
            case RECTANGLE:
                Double width = random.nextDouble();
                Double height = random.nextDouble();
                return new Rectangle(width, height, ColorSupplier.getRandomColor());
            case SQUARE:
                Double side = random.nextDouble();
                return new Square(side, ColorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                Double firstLeg = random.nextDouble();
                Double secondLeg = random.nextDouble();
                return new RightTriangle(firstLeg, secondLeg, ColorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                Double shortBase = random.nextDouble();
                Double longBase = random.nextDouble();
                Double legsLength = random.nextDouble();
                Double trapezoidHeight = random.nextDouble();
                Double baseAngle = random.nextDouble();
                return new IsoscelesTrapezoid(shortBase, longBase, legsLength,
                        trapezoidHeight, baseAngle, ColorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(10.0, FigureColor.WHITE.toString().toLowerCase());
    }
}
