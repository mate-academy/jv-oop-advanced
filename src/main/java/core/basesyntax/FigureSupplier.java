package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private static final int BOUND_FIGURE = 5;
    private static final int MAXIMAL_SIZE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(BOUND_FIGURE) + 1;

        switch (randomFigure) {
            case 1:
                int radius = random.nextInt(MAXIMAL_SIZE);
                return new Circle(radius, colorSupplier.getRandomColor());
            case 2:
                int side = random.nextInt(MAXIMAL_SIZE);
                return new Square(side, colorSupplier.getRandomColor());
            case 3:
                int firstSide = random.nextInt(MAXIMAL_SIZE);
                int secondSide = random.nextInt(MAXIMAL_SIZE);
                return new Rectangle(firstSide, secondSide, colorSupplier.getRandomColor());
            case 4:
                int firstLeg = random.nextInt(MAXIMAL_SIZE);
                int secondLeg = random.nextInt(MAXIMAL_SIZE);
                return new RightTriangle(firstLeg, secondLeg,
                        colorSupplier.getRandomColor());
            default:
                int topSide = random.nextInt(MAXIMAL_SIZE);
                int bottomSide = random.nextInt(MAXIMAL_SIZE);
                int height = random.nextInt(MAXIMAL_SIZE);
                return new IsoscelesTrapezoid(topSide, bottomSide, height,
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name());
    }
}
