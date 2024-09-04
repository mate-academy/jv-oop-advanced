package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    public static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                final double radius = random.nextDouble() * 100;

                return new Circle(color, radius);
            case 1:
                final double side = random.nextDouble() * 100;

                return new Square(color, side);
            case 2:
                final double firstSide = random.nextDouble() * 100;
                final double secondSide = random.nextDouble() * 100;

                return new Rectangle(color, firstSide, secondSide);
            case 3:
                final double firstLeg = random.nextDouble() * 100;
                final double secondLeg = random.nextDouble() * 100;

                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                final double base = random.nextDouble() * 100;
                final double lateralSide = random.nextDouble() * 100;

                return new IsoscelesTrapezoid(color, base, lateralSide);
        }
    }

    public Figure getDefaultFigure() {
        final String color = Color.WHITE.name();
        final double radius = 10.0;

        return new Circle(color, radius);
    }
}
