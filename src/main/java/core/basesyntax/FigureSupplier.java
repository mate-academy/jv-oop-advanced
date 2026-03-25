package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_VALUE = 10;
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        switch (figureType) {
            case 0:
                String color = colorSupplier.getRandomColor();
                double side = getRandomValue();
                return new Square(color, side);
            case 1:
                String color1 = colorSupplier.getRandomColor();
                double side1 = getRandomValue();
                return new Circle(color1, side1);
            case 2:
                String color2 = colorSupplier.getRandomColor();
                double side2 = getRandomValue();
                double side3 = getRandomValue();
                return new RightTriangle(color2, side2,
                        side3);
            case 3:
                String color3 = colorSupplier.getRandomColor();
                double side4 = getRandomValue();
                double side5 = getRandomValue();
                return new Rectangle(color3, side4, side5);

            case 4:
                String color4 = colorSupplier.getRandomColor();
                double side6 = getRandomValue();
                double side7 = getRandomValue();
                double side8 = getRandomValue();
                return new IsoscelesTrapezoid(color4,side6, side7, side8);

            case 5:
            default:
                return null;
        }

    }

    private int getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(),DEFAULT_RADIUS);
    }
}
