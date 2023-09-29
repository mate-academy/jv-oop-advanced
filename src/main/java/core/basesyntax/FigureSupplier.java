package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int SIZE_LIMIT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                int side = random.nextInt(SIZE_LIMIT) + 1;
                return new Square(side, colorSupplier.getRandomColor());
            case 1:
                int firstSideOfRectangle = random.nextInt(SIZE_LIMIT) + 1;
                int secondSideOfRectangle = random.nextInt(SIZE_LIMIT) + 1;
                return new Rectangle(firstSideOfRectangle,
                        secondSideOfRectangle,
                        colorSupplier.getRandomColor());
            case 2:
                int firstLeg = random.nextInt(SIZE_LIMIT) + 1;
                int secondLeg = random.nextInt(SIZE_LIMIT) + 1;
                return new RightTriangle(firstLeg, secondLeg, colorSupplier.getRandomColor());
            case 3:
                int radius = random.nextInt(SIZE_LIMIT) + 1;
                return new Circle(radius, colorSupplier.getRandomColor());
            case 4:
                int firstSideOfIsoscelesTrapezoid = random.nextInt(SIZE_LIMIT) + 1;
                int secondSideOfIsoscelesTrapezoid = random.nextInt(SIZE_LIMIT) + 1;
                int height = random.nextInt(SIZE_LIMIT) + 1;
                return new IsoscelesTrapezoid(firstSideOfIsoscelesTrapezoid,
                        secondSideOfIsoscelesTrapezoid,
                        height,
                        colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
