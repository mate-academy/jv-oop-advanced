package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 50;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_LENGTH = 20;
    private static final int MIN_LENGTH = 1;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0:
                return new Circle(color, getRandomLength());
            case 1:
                return new Square(color, getRandomLength());
            case 2:
                return new Rectangle(color, getRandomLength(), getRandomLength());
            case 3:
                return new RightTriangle(color, getRandomLength(), getRandomLength());
            case 4:
                return new IsoscelesTrapezoid(color, getRandomLength(),
                        getRandomLength(), getRandomLength());
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomLength() {
        return random.nextInt(MAX_LENGTH) + MIN_LENGTH;
    }
}
