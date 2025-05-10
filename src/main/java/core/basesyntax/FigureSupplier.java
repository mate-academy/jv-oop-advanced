package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS_OF_CIRCLE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_VALUE_OF_RANDOM_NUMBER = 10;
    private static final int COUNT_OF_FIGURES = 5;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS_OF_CIRCLE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(COUNT_OF_FIGURES) + 1;
        switch (index) {
            case 1: {
                return getRandomSquare();
            }
            case 2: {
                return getRandomCircle();
            }
            case 3: {
                return getRandomRectangle();
            }
            case 4: {
                return getRandomRigthTriangle();
            }
            default: {
                return getRandomIsoscelesTrapezoid();
            }
        }
    }

    private Figure getRandomCircle() {
        Color color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER) + 1;
        return new Circle(color, radius);
    }

    private Figure getRandomSquare() {
        Color color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER) + 1;
        return new Square(color, side);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        Color color = colorSupplier.getRandomColor();
        int firstBasis = random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER) + 1;
        int secondBasis = random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER) + 1;
        int heigth = random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER) + 1;
        return new IsoscelesTrapezoid(color, firstBasis, secondBasis, heigth);
    }

    private Figure getRandomRigthTriangle() {
        Color color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER) + 1;
        int secondLeg = random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER) + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomRectangle() {
        Color color = colorSupplier.getRandomColor();
        int side1 = random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER) + 1;
        int side2 = random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER) + 1;
        return new Rectangle(color, side1, side2);
    }
}
