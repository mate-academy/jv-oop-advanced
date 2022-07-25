package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int AMOUNT_OF_NUMBERS = 6;
    private static final String DEFAULT_COLOR = "RED";
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(NUMBER_OF_FIGURES);
        switch (randomFigureIndex) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getIsoscelesTrapezoid();
        }
    }

    public double getRandomNumber() {
        return random.nextInt(AMOUNT_OF_NUMBERS) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        double firstRandomNumber = getRandomNumber();
        return new Square(color, firstRandomNumber);
    }

    private Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        double firstRandomNumber = getRandomNumber();
        return new Circle(color, firstRandomNumber);
    }

    private Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        double firstRandomNumber = getRandomNumber();
        double secondRandomNumber = getRandomNumber();
        return new Rectangle(color, firstRandomNumber, secondRandomNumber);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        double firstRandomNumber = getRandomNumber();
        double secondRandomNumber = getRandomNumber();
        return new RightTriangle(color, firstRandomNumber, secondRandomNumber);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, getRandomNumber(),
                getRandomNumber(), getRandomNumber());
    }
}
