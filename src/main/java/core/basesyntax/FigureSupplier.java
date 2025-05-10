package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int RANGE = 100;
    private ColorSupplier colorGenerator = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = new Random().nextInt(NUMBER_OF_FIGURES);
        switch (number) {
            case 1:
                return createCircle();
            case 2:
                return createIsoscelesTrapezoid();
            case 3:
                return createRectangle();
            case 4:
                return createRightTriangle();
            default:
                return createSquare();
        }
    }

    public int getRandomNumber() {
        return new Random().nextInt(RANGE);
    }

    private Circle createCircle() {
        String color = colorGenerator.getRandomColor();
        int radius = getRandomNumber();
        return new Circle(radius, color);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        String color = colorGenerator.getRandomColor();
        int height = getRandomNumber();
        int mediumLine = getRandomNumber();
        return new IsoscelesTrapezoid(height, mediumLine, color);
    }

    private Rectangle createRectangle() {
        String color = colorGenerator.getRandomColor();
        int height = getRandomNumber();
        int width = getRandomNumber();
        return new Rectangle(height, width, color);
    }

    private RightTriangle createRightTriangle() {
        String color = colorGenerator.getRandomColor();
        int legOne = getRandomNumber();
        int legTwo = getRandomNumber();
        return new RightTriangle(legOne, legTwo, color);
    }

    private Square createSquare() {
        String color = colorGenerator.getRandomColor();
        int side = getRandomNumber();
        return new Square(side, color);
    }
}
