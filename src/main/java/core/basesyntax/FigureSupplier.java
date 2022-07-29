package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int UPPER_BOUND_OF_RANDOM = 200;
    private static final int NUMBER_OF_FIGURES = 5;

    public Figure getRandomFigure() {
        Random randomNumber = new Random();
        ColorSupplier randomColor = new ColorSupplier();
        switch (randomNumber.nextInt(NUMBER_OF_FIGURES)) {
            case 0: return new Circle(randomNumber.nextInt(UPPER_BOUND_OF_RANDOM),
                    randomColor.getRandomColor());
            case 1: return new IsoscelesTrapezoid(randomNumber.nextInt(UPPER_BOUND_OF_RANDOM),
                    randomNumber.nextInt(UPPER_BOUND_OF_RANDOM),
                    randomNumber.nextInt(UPPER_BOUND_OF_RANDOM),
                    randomColor.getRandomColor());
            case 2: return new Rectangle(randomNumber.nextInt(UPPER_BOUND_OF_RANDOM),
                    randomNumber.nextInt(UPPER_BOUND_OF_RANDOM),
                    randomColor.getRandomColor());
            case 3: return new RightTriangle(randomNumber.nextInt(UPPER_BOUND_OF_RANDOM),
                    randomNumber.nextInt(UPPER_BOUND_OF_RANDOM),
                    randomColor.getRandomColor());
            case 4: return new Square(randomNumber.nextInt(UPPER_BOUND_OF_RANDOM),
                    randomColor.getRandomColor());
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
