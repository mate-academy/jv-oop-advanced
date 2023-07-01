package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int BOUND_VALUE = 20;
    private static final int DEFAULT_VALUE = 10;
    private static final String DEFAULT_COLOR = Colors.WHITE.toString();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 1:
                int radius = random.nextInt(BOUND_VALUE);
                return new Circle(color, radius);
            case 2:
                int firstLeg = random.nextInt(BOUND_VALUE);
                int secondLeg = random.nextInt(BOUND_VALUE);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                int sideA = random.nextInt(BOUND_VALUE);
                int sideB = random.nextInt(BOUND_VALUE);
                int height = random.nextInt(BOUND_VALUE);
                return new IsoscelesTrapezoid(color, sideA, sideB, height);
            case 4:
                int length = random.nextInt(BOUND_VALUE);
                int width = random.nextInt(BOUND_VALUE);
                return new Rectangle(color, length, width);
            default:
                int side = random.nextInt(BOUND_VALUE);
                return new Square(color, side);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_VALUE);
    }
}
