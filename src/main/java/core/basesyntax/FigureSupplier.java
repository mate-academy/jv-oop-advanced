package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int SIZE_LIMIT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomValue() {
        return random.nextInt(SIZE_LIMIT) + 1;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return new Square(getRandomValue(), colorSupplier.getRandomColor());
            case 1:
                int firstSideOfRectangle = getRandomValue();
                int secondSideOfRectangle = getRandomValue();
                return new Rectangle(firstSideOfRectangle,
                        secondSideOfRectangle,
                        colorSupplier.getRandomColor());
            case 2:
                int firstLeg = getRandomValue();
                int secondLeg = getRandomValue();
                return new RightTriangle(firstLeg, secondLeg, colorSupplier.getRandomColor());
            case 3:
                int radius = getRandomValue();
                return new Circle(radius, colorSupplier.getRandomColor());
            case 4:
                int firstSideOfIsoscelesTrapezoid = getRandomValue();
                int secondSideOfIsoscelesTrapezoid = getRandomValue();
                int height = getRandomValue();
                return new IsoscelesTrapezoid(firstSideOfIsoscelesTrapezoid,
                        secondSideOfIsoscelesTrapezoid,
                        height,
                        colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }
}
