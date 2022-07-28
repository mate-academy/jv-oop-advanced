package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER_RANGE_FOR_FIGURE_SIDES = 100;
    private static final int CIRCLE_DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        String randomFigure = AllOurFigures.values()[new Random()
                .nextInt(AllOurFigures.values().length)].toString();

        switch (randomFigure) {
            case "SQUARE":
                return new Square(supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER_RANGE_FOR_FIGURE_SIDES));
            case "RECTANGLE":
                return new Rectangle(supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER_RANGE_FOR_FIGURE_SIDES),
                        random.nextInt(MAX_RANDOM_NUMBER_RANGE_FOR_FIGURE_SIDES));
            case "RIGHT_TRIANGLE":
                return new RightTriangle(supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER_RANGE_FOR_FIGURE_SIDES),
                        random.nextInt(MAX_RANDOM_NUMBER_RANGE_FOR_FIGURE_SIDES));
            case "CIRCLE":
                return new Circle(supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER_RANGE_FOR_FIGURE_SIDES));
            default:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER_RANGE_FOR_FIGURE_SIDES),
                        random.nextInt(MAX_RANDOM_NUMBER_RANGE_FOR_FIGURE_SIDES),
                        random.nextInt(MAX_RANDOM_NUMBER_RANGE_FOR_FIGURE_SIDES));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", CIRCLE_DEFAULT_RADIUS);
    }
}
