package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String WHITE = "white";
    private static final int RADIUS_DEFAULT = 10;
    private static final int MAX_RANDOM = 25;
    private static final int ONE = 1;
    private Random random = new Random();
    private int randomInt;

    public Figure getDefaultFigure() {
        return new Circle(RADIUS_DEFAULT, WHITE);
    }

    public Figure getRandomFigure() {
        randomInt = random.nextInt(5) + 1;
        switch (randomInt) {
            case 1: {
                return getRandomCircle();
            }
            case 2: {
                return getRandomIsoscelesTrapezoid();
            }
            case 3: {
                return getRandomRectangle();
            }
            case 4: {
                return getRandomRightTriangle();
            }
            case 5: {
                return getRandomSquare();
            }
            default:
                return getDefaultFigure();
        }
    }

    private int randomNumberForLegs() {
        return random.nextInt(MAX_RANDOM) + ONE;
    }

    private String color() {
        return new ColorSupplier().getRandomColor();
    }

    private Figure getRandomCircle() {
        return new Circle(randomNumberForLegs(), color());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomNumberForLegs(),
                randomNumberForLegs(),randomNumberForLegs(),color());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(randomNumberForLegs(),
                randomNumberForLegs(),color());
    }

    private Figure getRandomRightTriangle() {
        return new Square(randomNumberForLegs(),color());
    }

    private Figure getRandomSquare() {
        return new Square(randomNumberForLegs(),color());
    }
}
