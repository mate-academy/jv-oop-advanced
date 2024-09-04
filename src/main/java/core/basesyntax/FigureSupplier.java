package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_VALUE = 100;
    private static final int FIGURE_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private double getRandomValue() {
        return random.nextDouble() * MAX_VALUE;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                double radius = getRandomValue();

                return new Circle(color, radius);
            case 1:
                double side = getRandomValue();

                return new Square(color, side);
            case 2:
                double firstSide = getRandomValue();
                double secondSide = getRandomValue();

                return new Rectangle(color, firstSide, secondSide);
            case 3:
                double firstLeg = getRandomValue();
                double secondLeg = getRandomValue();

                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                double firstBase = getRandomValue();
                double secondBase = getRandomValue();
                double height = getRandomValue();

                return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
