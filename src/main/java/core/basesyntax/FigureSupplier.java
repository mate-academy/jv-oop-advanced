package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_NUMBER_INDEX_FIGURE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.toString());
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomNumber = random.nextInt(RANDOM_NUMBER_INDEX_FIGURE);
        switch (randomNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        float radius = MAX_RANDOM_NUMBER * random.nextFloat();
        return new Circle(radius, color);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        float innerSide = MAX_RANDOM_NUMBER * random.nextFloat();
        float downSide = MAX_RANDOM_NUMBER * random.nextFloat();
        float heightTrapezoid = MAX_RANDOM_NUMBER * random.nextFloat();
        return new IsoscelesTrapezoid(innerSide, downSide, heightTrapezoid, color);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        float firstLeg = MAX_RANDOM_NUMBER * random.nextFloat();
        float secondLeg = MAX_RANDOM_NUMBER * random.nextFloat();
        return new Rectangle(firstLeg, secondLeg, color);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        float firstLeg = MAX_RANDOM_NUMBER * random.nextFloat();
        float secondLeg = MAX_RANDOM_NUMBER * random.nextFloat();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        float side = MAX_RANDOM_NUMBER * random.nextFloat();
        return new Square(side, color);
    }
}
