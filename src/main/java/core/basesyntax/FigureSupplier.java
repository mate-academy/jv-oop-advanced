package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return getDefaultCircle();
    }

    private int getRandomInt() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomInt());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble(),
                getRandomDouble());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomInt(),
                getRandomInt());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomInt());
    }

    private Circle getDefaultCircle() {
        return new Circle(Color.GREEN.name(), 20);
    }
}
