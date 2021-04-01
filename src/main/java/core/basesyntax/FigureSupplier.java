package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random randomNumber = new Random();
        Random randomValueOfField = new Random();
        final int upperValueBound = 1000;
        final int amountOfShapes = 4;
        int shapeCase = randomNumber.nextInt(amountOfShapes) + 1;
        int randomValue = randomValueOfField.nextInt(upperValueBound) + 1;
        switch (shapeCase) {
            case 1:
                Square square = new Square(ColorSupplier.getRandomColor(), randomValue);
                return square;
            case 2:
                Rectangle rectangle = new Rectangle(ColorSupplier.getRandomColor(), randomValue,
                        randomValue);
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle(ColorSupplier.getRandomColor(),
                        randomValue, randomValue);
                return rightTriangle;
            case 4:
                Circle circle = new Circle(ColorSupplier.getRandomColor(), randomValue);
                return circle;
            case 5:
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(ColorSupplier.getRandomColor()
                        , randomValue, randomValue, randomValue);
                return trapezoid;
            default:
                break;
        }
        return null;
    }
}
