package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                int squareSide = random.nextInt(MAX_VALUE) + 1;
                return new Square(color, squareSide);

            case 1:
                int firstRectangleSide = random.nextInt(MAX_VALUE) + 1;
                int secondRectangleSide = random.nextInt(MAX_VALUE) + 1;
                return new Rectangle(
                        color,
                        firstRectangleSide,
                        secondRectangleSide);

            case 2:
                int firstLeg = random.nextInt(MAX_VALUE) + 1;
                int secondLeg = random.nextInt(MAX_VALUE) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);

            case 3:
                int radius = random.nextInt(MAX_VALUE) + 1;
                return new Circle(color, radius);

            case 4:
                int firstBase = random.nextInt(MAX_VALUE) + 1;
                int secondBase = random.nextInt(MAX_VALUE) + 1;
                int height = random.nextInt(MAX_VALUE) + 1;
                return new IsoscelesTrapezoid(
                        color,
                        firstBase,
                        secondBase,
                        height);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
