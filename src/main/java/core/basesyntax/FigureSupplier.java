package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int MAX_RANDOM_LENGTH = 25;
    private final Random random = new Random();
    private final Circle defaultFigure = new Circle("WHITE", 10);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int bondsOfRandom = NUMBER_OF_FIGURES - 1;
        int figureNumber = random.nextInt(bondsOfRandom);

        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomLength());
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomLength());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomLength(), getRandomLength());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomLength(), getRandomLength());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomLength(), getRandomLength(), getRandomLength());
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }

    private int getRandomLength() {
        return random.nextInt(MAX_RANDOM_LENGTH) + 1;
    }
}
