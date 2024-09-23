package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MIN_DIMENSION = 1;
    private static final int MAX_DIMENSION = 10;
    private static final int FIGURE_COUNT = 5;
    private static final double RADIUS_OF_DEFAULT_FIGURE = 10.00;
    private static final String COLOR_OF_DEFAULT_FIGURE = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomDigit = random.nextInt(FIGURE_COUNT);
        if (randomDigit == 0) {
            String color = colorSupplier.getRandomColor().toLowerCase();
            double radius = MIN_DIMENSION + random.nextDouble() * MAX_DIMENSION;
            return new Circle(color, radius);
        } else if (randomDigit == 1) {
            String color = colorSupplier.getRandomColor().toLowerCase();
            double side = MIN_DIMENSION + random.nextDouble() * MAX_DIMENSION;
            return new Square(color, side);
        } else if (randomDigit == 2) {
            String color = colorSupplier.getRandomColor().toLowerCase();
            double firstLeg = MIN_DIMENSION + random.nextDouble() * MAX_DIMENSION;
            double secondLeg = MIN_DIMENSION + random.nextDouble() * MAX_DIMENSION;
            return new RightTriangle(color, firstLeg, secondLeg);
        } else if (randomDigit == 3) {
            String color = colorSupplier.getRandomColor().toLowerCase();
            double height = MIN_DIMENSION * random.nextDouble() * MAX_DIMENSION;
            double width = MIN_DIMENSION * random.nextDouble() * MAX_DIMENSION;
            return new Rectangle(color, height, width);
        } else {
            String color = colorSupplier.getRandomColor().toLowerCase();
            double height = MIN_DIMENSION * random.nextDouble() * MAX_DIMENSION;
            double base1 = MIN_DIMENSION * random.nextDouble() * MAX_DIMENSION;
            double base2 = MIN_DIMENSION * random.nextDouble() * MAX_DIMENSION;
            return new IsoscelesTrapezoid(color, height, base1, base2);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_OF_DEFAULT_FIGURE, RADIUS_OF_DEFAULT_FIGURE);
    }
}

