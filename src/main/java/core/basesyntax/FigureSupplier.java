package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM_NUMBER = 20;
    public static final int RANDOM_RADIUS = 10;

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT) + 1;
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        switch (figureIndex) {
            case 1:
                return new Circle(color, getRandomNumber());
            case 2:
                return new IsoscelesTrapezoid(color, getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new Rectangle(color, getRandomNumber(), getRandomNumber());
            case 4:
                return new RightTriangle(color, getRandomNumber(), getRandomNumber());
            case 5:
            default:
                return new Square(color, getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), RANDOM_RADIUS);
    }
}
