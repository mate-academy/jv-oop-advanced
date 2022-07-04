package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_FIGURE = 4;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_NUMBER = 10;
    private static final int LIMIT_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(DEFAULT_FIGURE);
        switch (randomFigure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt(),
                        getRandomInt());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
    }

    private int getRandomInt() {
        return random.nextInt(LIMIT_NUMBER);
    }
}
