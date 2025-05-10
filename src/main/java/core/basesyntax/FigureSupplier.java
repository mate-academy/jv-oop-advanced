package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0d;
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_COUNT);
        switch (figureType) {
            case 0:
                double radius = random.nextDouble(MAX_VALUE);
                return new Circle(color, radius);
            case 1:
                double side = random.nextDouble(MAX_VALUE);
                return new Square(color, side);
            case 2:
                double shortSide = random.nextDouble(MAX_VALUE);
                double longSide = random.nextDouble(MAX_VALUE);
                return new Rectangle(color, shortSide, longSide);
            case 3:
                double firstLeg = random.nextDouble(MAX_VALUE);
                double secondLeg = random.nextDouble(MAX_VALUE);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 4:
                double upperSide = random.nextDouble(MAX_VALUE);
                double bottomSide = random.nextDouble(MAX_VALUE);
                double height = random.nextDouble(MAX_VALUE);
                return new IsoscelesTrapezoid(color, upperSide, bottomSide, height);
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
