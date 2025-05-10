package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    static final int DEFAULT_RADIUS = 10;
    static final int MAX_NUMBER_OF_FIGURES = 5;
    static final int MAX_LENGTH = 10;
    static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER_OF_FIGURES);
        switch (randomNumber) {
            case 0:
                return new Rectangle(randomColor,
                        getRandomSizeOfSide(), getRandomSizeOfSide());
            case 1:
                return new Circle(randomColor, getRandomSizeOfSide());
            case 2:
                return new Square(randomColor, getRandomSizeOfSide());
            case 3:
                return new IsoscelesTrapezoid(randomColor,
                        getRandomSizeOfSide(), getRandomSizeOfSide(),
                        getRandomSizeOfSide(), getRandomSizeOfSide());
            case 4:
                return new RightTriangle(randomColor,
                        getRandomSizeOfSide(), getRandomSizeOfSide());
            default:
                return getDefaultFigure();

        }
    }

    private int getRandomSizeOfSide() {
        return MAX_LENGTH + random.nextInt(MAX_LENGTH);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
