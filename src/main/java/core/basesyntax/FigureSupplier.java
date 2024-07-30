package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int radiusForDefaultFigure = 10;
    private static final String colorForDefaultFigure = Color.WHITE.name();
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = rand.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (number) {
            case 0:
                double radius = getRandomSize();
                return new Circle(randomColor, radius);
            case 1:
                double firstSide = getRandomSize();
                double secondSide = getRandomSize();
                return new Rectangle(randomColor, firstSide, secondSide);
            case 2:
                double side = getRandomSize();
                return new Square(randomColor, side);
            case 3:
                double topBase = getRandomSize();
                double bottomBase = getRandomSize();
                double leg = getRandomSize();
                double baseAngle = rand.nextDouble(85.00);
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, leg, baseAngle);
            default:
                double firstLeg = getRandomSize();
                double secondLeg = getRandomSize();
                return new RightTriangle(randomColor, firstLeg, secondLeg);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(colorForDefaultFigure, radiusForDefaultFigure);
    }

    private double getRandomSize() {
        return rand.nextDouble(100.00);
    }
}
