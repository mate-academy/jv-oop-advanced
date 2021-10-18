package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_COUNT = 10;
    private static final int FIGURE_COUNT = 5;

    public int getRandomNumber() {
        return new Random().nextInt(NUMBER_COUNT) + 1;
    }

    public Figure getRandomFigure() {
        String randomColor = new ColorSupplier().getRandomColor();
        switch (new Random().nextInt(FIGURE_COUNT)) {
            case (0):
                return new IsoscelesTrapezoid(randomColor, getRandomNumber(), getRandomNumber(),
                        getRandomNumber());
            case (1):
                return new Circle(randomColor, getRandomNumber());
            case (2):
                return new RightTriangle(randomColor, getRandomNumber(), getRandomNumber());
            case (3):
                return new Rectangle(randomColor, getRandomNumber(), getRandomNumber());
            default:
                return new Square(randomColor, getRandomNumber());
        }
    }
}
