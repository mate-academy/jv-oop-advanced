package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int SIDE_LENGTH = 10;
    private static final int RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_AMOUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Circle(randomColor, getRandomLength());
            case 1:
                return new Square(randomColor, getRandomLength());
            case 2:
                return new Rectangle(randomColor, getRandomLength(), getRandomLength());
            case 3:
                return new IsoscelesTrapezoid(randomColor, getRandomLength(),
                        getRandomLength(), getRandomLength());
            case 4:
                return new RightTriangle(randomColor, getRandomLength(), getRandomLength());
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomLength() {
        return random.nextInt(SIDE_LENGTH) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", RADIUS);
    }
}

