package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 10;
    private static final int FIGURE_AMOUNT = 5;

    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = new Random().nextInt(FIGURE_AMOUNT);

        switch (randomIndex) {
            case 0:
                return createRandomCircle();
            case 1:
                return  createRandomIsoscelesTrapezoid();
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

    private Figure createRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = new Random().nextInt(MAX_VALUE);

        return new Circle(color, radius);
    }

    private Figure createRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int lengthOfUpperBase = new Random().nextInt(MAX_VALUE);
        int lengthOfLowerBase = new Random().nextInt(MAX_VALUE);
        int height = new Random().nextInt(MAX_VALUE);

        return new IsoscelesTrapezoid(color, lengthOfUpperBase, lengthOfLowerBase, height);
    }

    private Figure createRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int length = new Random().nextInt(MAX_VALUE);
        int width = new Random().nextInt(MAX_VALUE);

        return new Rectangle(color, length, width);
    }

    private Figure createRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = new Random().nextInt(MAX_VALUE);
        int secondLeg = new Random().nextInt(MAX_VALUE);

        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int sideLength = new Random().nextInt(MAX_VALUE);

        return new Square(color, sideLength);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.White.name(), MAX_VALUE);
    }
}
