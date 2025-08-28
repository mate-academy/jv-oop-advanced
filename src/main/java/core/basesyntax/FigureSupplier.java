package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 10;
    private static final int FIGURES_COUNT = 5;
    private static final Random RANDOM = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexOfFigure = RANDOM.nextInt(FIGURES_COUNT);

        return switch (indexOfFigure) {
            case 1 -> getRandomIsoscelesTrapezoid();
            case 2 -> getRandomRectangle();
            case 3 -> getRandomRightTriangle();
            case 4 -> getRandomSquare();
            default -> getRandomCircle();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), MAX_VALUE);
    }

    private int getRandomSize() {
        return RANDOM.nextInt(MAX_VALUE);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomSize());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomSize(),
                getRandomSize(),
                getRandomSize());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomSize(),
                getRandomSize());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomSize(),
                getRandomSize());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomSize());
    }
}
