package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_BOUND = 20;
    private static final int FIGURES_NUMBER = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURES_NUMBER);
        switch (randomFigureNumber) {
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_RADIUS);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber(),
                getRandomNumber());
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomNumber());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomNumber());
    }

    private double getRandomNumber() {
        return random.nextInt(MAX_BOUND) + (double) random.nextInt(MAX_BOUND) / 10;
    }
}
