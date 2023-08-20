package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 10;
    private static final int FIGURE_AMOUNT = 5;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURE_AMOUNT);

        switch (randomIndex) {
            case 0:
                return createRandomCircle();
            case 1:
                return createRandomIsoscelesTrapezoid();
            case 2:
                return createRandomRectangle();
            case 3:
                return createRandomRightTriangle();
            case 4:
                return createRandomSquare();
            default:
                return createRandomCircle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), MAX_VALUE);
    }

    private Figure createRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_VALUE);

        return new Circle(color, radius);
    }

    private Figure createRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int lengthOfUpperBase = random.nextInt(MAX_VALUE);
        int lengthOfLowerBase = random.nextInt(MAX_VALUE);
        int height = random.nextInt(MAX_VALUE);

        return new IsoscelesTrapezoid(color, lengthOfUpperBase, lengthOfLowerBase, height);
    }

    private Figure createRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int length = random.nextInt(MAX_VALUE);
        int width = random.nextInt(MAX_VALUE);

        return new Rectangle(color, length, width);
    }

    private Figure createRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_VALUE);
        int secondLeg = random.nextInt(MAX_VALUE);

        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int sideLength = random.nextInt(MAX_VALUE);

        return new Square(color, sideLength);
    }
}
