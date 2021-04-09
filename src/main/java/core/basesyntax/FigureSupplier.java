package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUM_FIGURES = 5;
    public static final int MAX_PROPERTY_VALUE = 20;

    public Figure getRandomFigure() {
        Random randomNumber = new Random();
        int figureNumber = randomNumber.nextInt(MAX_NUM_FIGURES) + 1;
        if (figureNumber == 1) {
            return getNewCircle();
        } else if (figureNumber == 2) {
            return getNewIsoscelesTrapezoid();
        } else if (figureNumber == 3) {
            return getNewRectangle();
        } else if (figureNumber == 4) {
            return getNewRightTriangle();
        } else {
            return getNewSquare();
        }
    }

    private Figure getNewCircle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();
        double numForAreaX = randomNumber.nextInt(MAX_PROPERTY_VALUE) + 1;
        Figure circle = new Circle(numForAreaX, colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getNewIsoscelesTrapezoid() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();
        double numForAreaX = randomNumber.nextInt(MAX_PROPERTY_VALUE) + 1;
        double numForAreaY = randomNumber.nextInt(MAX_PROPERTY_VALUE) + 1;
        double numForAreaZ = randomNumber.nextInt(MAX_PROPERTY_VALUE) + 1;
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                numForAreaX,
                numForAreaY,
                numForAreaZ);
        return isoscelesTrapezoid;
    }

    private Figure getNewRectangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();
        double numForAreaX = randomNumber.nextInt(MAX_PROPERTY_VALUE) + 1;
        double numForAreaY = randomNumber.nextInt(MAX_PROPERTY_VALUE) + 1;
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(), numForAreaX, numForAreaY);
        return rectangle;
    }

    private Figure getNewRightTriangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();
        double numForAreaX = randomNumber.nextInt(MAX_PROPERTY_VALUE) + 1;
        double numForAreaY = randomNumber.nextInt(MAX_PROPERTY_VALUE) + 1;
        Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                numForAreaX,
                numForAreaY);
        return rightTriangle;
    }

    private Figure getNewSquare() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();
        double numForAreaX = randomNumber.nextInt(MAX_PROPERTY_VALUE) + 1;
        Figure square = new Square(colorSupplier.getRandomColor(), numForAreaX);
        return square;
    }
}
