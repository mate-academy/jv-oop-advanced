package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int FIGURE_COUNT = 5;
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        double MAX_VALUE = 100;

        switch (figureNumber) {
            case 0:
                final double radius = random.nextDouble() * MAX_VALUE;

                return new Circle(color, radius);
            case 1:
                final double side = random.nextDouble() * MAX_VALUE;

                return new Square(color, side);
            case 2:
                final double firstSide = random.nextDouble() * MAX_VALUE;
                final double secondSide = random.nextDouble() * MAX_VALUE;

                return new Rectangle(color, firstSide, secondSide);
            case 3:
                final double firstLeg = random.nextDouble() * MAX_VALUE;
                final double secondLeg = random.nextDouble() * MAX_VALUE;

                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                final double firstBase = random.nextDouble() * MAX_VALUE;
                final double secondBase = random.nextDouble() * MAX_VALUE;
                final double height = random.nextDouble() * MAX_VALUE;

                return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
        }
    }

    public Figure getDefaultFigure() {
        final String color = Color.WHITE.name();
        final double radius = 10.0;

        return new Circle(color, radius);
    }
}
