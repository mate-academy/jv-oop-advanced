package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;

    private static final double MIN_SIZE = 100;
    private static final double MAX_SIZE = 1000;

    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "White";

    private final Random random = new Random();

    public AbstractFigure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);

        switch (figureType) {
            case 0:
                double side = random.nextDouble(MIN_SIZE, MAX_SIZE);
                return new Square(side);

            case 1:
                double width = random.nextDouble(MIN_SIZE, MAX_SIZE);
                double rectangleHeight = random.nextDouble(MIN_SIZE, MAX_SIZE);
                return new Rectangle(width, rectangleHeight);

            case 2:
                double firstLeg = random.nextDouble(MIN_SIZE, MAX_SIZE);
                double secondLeg = random.nextDouble(MIN_SIZE, MAX_SIZE);
                return new RightTriangle(firstLeg, secondLeg);

            case 3:
                double topBase = random.nextDouble(MIN_SIZE, MAX_SIZE);
                double bottomBase = random.nextDouble(MIN_SIZE, MAX_SIZE);
                double height = random.nextDouble(MIN_SIZE, MAX_SIZE);
                double leg = random.nextDouble(MIN_SIZE, MAX_SIZE);
                return new IsoscelesTrapezoid(topBase, bottomBase, height, leg);

            case 4:
            default:
                double radius = random.nextDouble(MIN_SIZE, MAX_SIZE);
                return new Circle(radius);
        }
    }

    public AbstractFigure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
