package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 9;
    private static final int DEFAULT_RADIUS = 10;
    private static final int AMOUNT_FIGURE = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomIndex = random.nextInt(AMOUNT_FIGURE);

        switch (randomIndex) {
            case 0:
                return new Square(getRandomSide(), randomColor);
            case 1:
                return new IsoscelesTrapezoid(getRandomSide(),
                        getRandomSide(), getRandomSide(), randomColor);
            case 2:
                return new RightTriangle(getRandomSide(),
                        getRandomSide(), randomColor);
            case 3:
                return new Circle(getRandomSide(), randomColor);
            case 4:
                return new Rectangle(getRandomSide(),
                        getRandomSide(), randomColor);
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomSide() {
        return random.nextInt((MAX_SIZE)) + 1;
    }
}
