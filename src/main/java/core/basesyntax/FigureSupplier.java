package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER_FIGURES = 5;
    private static final int LIMIT_NUMBER = 7;

    private final Random random = new Random();
    private final Figure defaultFigure = new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_NUMBER_FIGURES);
        String randomColor = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                double radius = random.nextDouble() * LIMIT_NUMBER;
                return new Circle(randomColor,radius);
            case 1:
                double baseA = random.nextDouble() * LIMIT_NUMBER;
                double baseB = random.nextDouble() * LIMIT_NUMBER;
                double height = random.nextDouble() * LIMIT_NUMBER;
                return new IsoscelesTrapezoid(randomColor, baseA, baseB, height);
            case 2:
                double length = random.nextDouble() * LIMIT_NUMBER;
                double width = random.nextDouble() * LIMIT_NUMBER;
                return new Rectangle(randomColor, length, width);
            case 3:
                double firstLeg = random.nextDouble() * LIMIT_NUMBER;
                double secondLeg = random.nextDouble() * LIMIT_NUMBER;
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            case 4:
                double side = random.nextDouble() * LIMIT_NUMBER;
                return new Square(randomColor, side);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
