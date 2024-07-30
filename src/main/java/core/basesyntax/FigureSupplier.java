package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = rand.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (number) {
            case 0:
                double radius = rand.nextDouble(100.00);
                return new Circle(randomColor, radius);
            case 1:
                double firstSide = rand.nextDouble(100.00);
                double secondSide = rand.nextDouble(100.00);
                return new Rectangle(randomColor, firstSide, secondSide);
            case 2:
                double side = rand.nextDouble(100.00);
                return new Square(randomColor, side);
            case 3:
                double topBase = rand.nextDouble(100.00);
                double bottomBase = rand.nextDouble(100.00);
                double leg = rand.nextDouble(100.00);
                double baseAngle = rand.nextDouble(85.00);
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, leg, baseAngle);
            default:
                double firstLeg = rand.nextDouble(100.00);
                double secondLeg = rand.nextDouble(100.00);
                return new RightTriangle(randomColor, firstLeg, secondLeg);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);

    }
}
