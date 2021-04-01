package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int NUMBER_OF_FIGURES_TYPES = 5;
    static final int MAX_VALUE = 10;

    public Figure getRandomFigure() {
        Random figureNumber = new Random();
        Random figurePart = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (figureNumber.nextInt(NUMBER_OF_FIGURES_TYPES)) {
            case 0:
                return new Circle(figurePart.nextInt(MAX_VALUE) + 1,
                        colorSupplier.getRandomColor());
            case 1:
                return new Square(figurePart.nextInt(MAX_VALUE) + 1,
                        colorSupplier.getRandomColor());
            case 2:
                return new Triangle(figurePart.nextInt(MAX_VALUE) + 1,
                        figurePart.nextInt(MAX_VALUE) + 1, colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(figurePart.nextInt(MAX_VALUE) + 1,
                        figurePart.nextInt(MAX_VALUE) + 1, colorSupplier.getRandomColor());
            default:
                return new Trapezoid(figurePart.nextInt(MAX_VALUE) + 1,
                        figurePart.nextInt(MAX_VALUE) + 1, colorSupplier.getRandomColor());
        }
    }
}
