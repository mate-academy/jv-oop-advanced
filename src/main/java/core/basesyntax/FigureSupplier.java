package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0:
                double side = random.nextDouble() * 10 + 1;
                return new Square(colorSupplier.getRandomColor(), side);
            case 1:
                double sideA = random.nextDouble() * 10 + 1;
                double sideB = random.nextDouble() * 10 + 1;
                double heide = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), sideA, sideB, heide);
            case 2:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(colorSupplier.getRandomColor(), radius);
            case 3:
                double sideC = random.nextDouble() * 10 + 1;
                double height1 = random.nextDouble() * 10 + 1;
                return new RightTriangle(colorSupplier.getRandomColor(), sideC, height1);
            case 4:
                double sideD = random.nextDouble() * 10 + 1;
                double sideE = random.nextDouble() * 10 + 1;
                return new Rectangle(colorSupplier.getRandomColor(), sideD, sideE);
            default:
                double sideF = random.nextDouble() * 10 + 1;
                return new Square(colorSupplier.getRandomColor(), sideF);

        }

    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
