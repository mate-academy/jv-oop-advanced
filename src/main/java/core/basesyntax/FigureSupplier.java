package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "White";
    private static final double DEFAULT_RADIUS = 10.0d;
    private static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        final int maxValue = 100;
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_COUNT);
        switch (figureType) {
            case 0:
                double radius = random.nextDouble(maxValue);
                return new Circle(color, radius);
            case 1:
                double side = random.nextDouble(maxValue);
                return new Square(color, side);
            case 2:
                double shortSide = random.nextDouble(maxValue);
                double longSide = random.nextDouble(maxValue);
                return new Rectangle(color, shortSide, longSide);
            case 3:
                double firstLeg = random.nextDouble(maxValue);
                double secondLeg = random.nextDouble(maxValue);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 4:
                double upperSide = random.nextDouble(maxValue);
                double bottomSide = random.nextDouble(maxValue);
                double height = random.nextDouble(maxValue);
                return new IsoscelesTrapezoid(color, upperSide, bottomSide, height);
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
