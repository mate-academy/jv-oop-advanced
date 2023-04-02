package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "white";
    private static final int RADIUS_DEFAULT = 10;
    private static final int MAX_RANDOM = 20;
    private Random random = new Random();

    private int randomNumberForSide() {
        return random.nextInt(MAX_RANDOM) + 1;
    }

    private String color() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    private Figure getRandomCircle() {
        return new Circle(randomNumberForSide(), color());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomNumberForSide(), randomNumberForSide(),
                randomNumberForSide(), color());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(randomNumberForSide(), randomNumberForSide(), color());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(randomNumberForSide(), randomNumberForSide(), color());
    }

    private Figure getRandomSquare() {
        return new Square(randomNumberForSide(), color());
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS_DEFAULT, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int randomFigures;
        randomFigures = random.nextInt(5) + 1;
        switch (randomFigures) {
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
            default: {
                return getDefaultFigure();
            }
        }
    }
}
