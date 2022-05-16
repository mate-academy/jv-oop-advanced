package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int MAX_SIZE = 10;
    private static final int DEFAULT_SIZE = 10;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier(new Random());
        Random random = new Random();
        switch (random.nextInt(NUMBER_OF_FIGURE)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomSize());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), getRandomSize());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize(), getRandomSize());

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, DEFAULT_SIZE);
    }

    //size from 1 to maxSize including
    public int getRandomSize() {
        Random random = new Random();
        return random.nextInt(MAX_SIZE) + 1;
    }
}
