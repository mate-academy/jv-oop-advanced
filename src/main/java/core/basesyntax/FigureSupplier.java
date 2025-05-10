package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int VALUE_BOUND = 1000;
    public static final int AMOUNT_OF_SHAPES = 4;

    public Figure getRandomFigure() {
        Random randomNumber = new Random();
        Random randomValueOfField = new Random();
        int shapeCase = randomNumber.nextInt(AMOUNT_OF_SHAPES) + 1;
        int firstRandomValue = randomValueOfField.nextInt(VALUE_BOUND) + 1;
        int secondRandomValue = randomValueOfField.nextInt(VALUE_BOUND) + 1;
        int thirdRandomValue = randomValueOfField.nextInt(VALUE_BOUND) + 1;
        switch (shapeCase) {
            case 1:
                return new Square(ColorSupplier.getRandomColor(), firstRandomValue);
            case 2:
                return new Rectangle(ColorSupplier.getRandomColor(), firstRandomValue,
                        secondRandomValue);
            case 3:
                return new RightTriangle(ColorSupplier.getRandomColor(), firstRandomValue,
                        secondRandomValue);
            case 4:
                return new Circle(ColorSupplier.getRandomColor(), firstRandomValue);
            case 5:
            default:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), firstRandomValue,
                        secondRandomValue, thirdRandomValue);
        }
    }
}
