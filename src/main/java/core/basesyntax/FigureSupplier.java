package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURES_NUMBER = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final double SIDE_SIZE = 25.0;

    public static Figure getDefaultFigure() {
        return new Circle("WHITE", CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (random.nextInt(FIGURES_NUMBER)) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble() * SIDE_SIZE);

            case 2:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble() * SIDE_SIZE);

            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * SIDE_SIZE,
                        random.nextDouble() * SIDE_SIZE);

            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * SIDE_SIZE, random.nextDouble() * SIDE_SIZE,
                        random.nextDouble() * SIDE_SIZE);

            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * SIDE_SIZE,
                        random.nextDouble() * SIDE_SIZE);
        }
    }
}

