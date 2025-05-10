package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE_BOUND = 100;
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureChoice = random.nextInt(NUMBER_OF_FIGURE);
        switch (figureChoice) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomLength());
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomLength());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomLength(), getRandomLength());
            case 3:
                int biggestBase = getRandomLength();
                int smallerBase = getRandomLength();
                if (biggestBase >= smallerBase) {
                    return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                            biggestBase, smallerBase, getRandomLength());
                } else {
                    return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                            smallerBase, biggestBase, getRandomLength());
                }
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomLength(), getRandomLength());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_CIRCLE_RADIUS);
    }

    private int getRandomLength() {
        return random.nextInt(MAX_SIDE_BOUND);
    }
}
