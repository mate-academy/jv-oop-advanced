package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_FIGURE = 10;
    private static final int RANDOM_RANGE = 5;

    public Figure getRandomFigure() {
        Random random = new Random();
        Figure figure;
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomFig = random.nextInt(5);
        switch (randomFig) {
            case 1 :
                int radius = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
                figure = new Circle(colorSupplier.getRandomColor(),
                        radius);
                break;
            case 2 :
                int sideA = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
                int sideB = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
                figure = new Rectangle(colorSupplier.getRandomColor(), sideA, sideB);
                break;
            case 3 :
                int firstLeg = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
                int secondLeg = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
                figure = new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
                break;
            case 4 :
                int legs = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
                int upperSide = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
                int lowerSide = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        legs, upperSide, lowerSide);
                break;
            default :
                int side = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
                figure = new Square(colorSupplier.getRandomColor(), side);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_FIGURE);
    }
}
