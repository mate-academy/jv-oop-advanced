package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int MAX_FIGURE = 3;
    public static final int MAX_SIDE = 20;
    public Figure getRandomFigure() {
        int figureNumber = new Random().nextInt(MAX_FIGURE);
        int firstNumber = new Random().nextInt(MAX_SIDE);
        int secondNumber = new Random().nextInt(MAX_SIDE);
        int thirdNumber = new Random().nextInt(MAX_SIDE);
        String color = String.valueOf(ColorSupplier.getRandomColor());

        switch (figureNumber) {
            case 0:
                return new Circle(color, firstNumber);
            case 1:
                return new IsoscelesTrapezoid(color, firstNumber, secondNumber, thirdNumber);
            case 2:
                return new Rectangle(color, firstNumber, secondNumber);
            case 3:
                return new RightTriangle(color, firstNumber, secondNumber);
        }
        return new Square(color, firstNumber);
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
