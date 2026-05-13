package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 10;
    private static final int MIN_SIZE = 1;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0:
                double side = random.nextDouble(MAX_SIZE) + MIN_SIZE;
                return new Square(colorSupplier.getRandomColor().toLowerCase(), side);
            case 1:
                double sideA = random.nextDouble(MAX_SIZE) + MIN_SIZE;
                double sideB = random.nextDouble(MAX_SIZE) + MIN_SIZE;
                double heide = random.nextDouble(MAX_SIZE) + MIN_SIZE;
                return new IsoscelesTrapezoid(colorSupplier
                        .getRandomColor().toLowerCase(), sideA, sideB, heide);
            case 2:
                double radius = random.nextDouble(MAX_SIZE) + MIN_SIZE;
                return new Circle(colorSupplier.getRandomColor().toLowerCase(), radius);
            case 3:
                double sideC = random.nextDouble(MAX_SIZE) + MIN_SIZE;
                double height1 = random.nextDouble(MAX_SIZE) + MIN_SIZE;
                return new RightTriangle(colorSupplier.getRandomColor()
                        .toLowerCase(), sideC, height1);
            case 4:
                double sideD = random.nextDouble(MAX_SIZE) + MIN_SIZE;
                double sideE = random.nextDouble(MAX_SIZE) + MIN_SIZE;
                return new Rectangle(colorSupplier.getRandomColor().toLowerCase(), sideD, sideE);
            default:
                double sideF = random.nextDouble(MAX_SIZE) + MIN_SIZE;
                return new Square(colorSupplier.getRandomColor().toLowerCase(), sideF);

        }

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }
}
