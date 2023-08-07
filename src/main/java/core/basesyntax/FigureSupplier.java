package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int RANDOM_RANGE = 10;
    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0: {
                int radius = random.nextInt(RANDOM_RANGE);
                return new Circle(colorSupplier.getRandomColor(), radius);
            }
            case 1: {
                int sideA = random.nextInt(RANDOM_RANGE);
                int sideB = random.nextInt(RANDOM_RANGE);
                int height = random.nextInt(RANDOM_RANGE);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), sideA, sideB, height);
            }
            case 2: {
                int sideA = random.nextInt(RANDOM_RANGE);
                int sideB = random.nextInt(RANDOM_RANGE);
                return  new Rectangle(colorSupplier.getRandomColor(), sideA, sideB);
            }
            case 3: {
                int firstLeg = random.nextInt(RANDOM_RANGE);
                int secondLeg = random.nextInt(RANDOM_RANGE);
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            }
            case 4: {
                int side = random.nextInt(RANDOM_RANGE);
                return new Square(colorSupplier.getRandomColor(), side);
            }

        }
    }
    public Figure getDefaultFigure() {

    }
}
