package core.basesyntax;

import core.basesyntax.figure.*;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        Color color = supplier.getRandomColor();
        return switch (random.nextInt(FIGURE_COUNT)) {
            case 0 -> getRandomCircle(color);
            case 1 -> getRandomRectangle(color);
            case 2 -> getRandomIsoscelentTrapezoid(color);
            case 3 -> getRandomSquare(color);
            case 4 -> getRandomRightTriangle(color);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    private Circle getRandomCircle(Color color) {
        return new Circle(random.nextInt(10) + 1, color);
    }

    private Square getRandomSquare(Color color) {
        return new Square(random.nextInt(10) + 1, color);
    }

    private Rectangle getRandomRectangle(Color color) {
        return new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1, color);
    }

    private RightTriangle getRandomRightTriangle(Color color) {
        return new RightTriangle(random.nextInt(10) + 1, random.nextInt(10) + 1, color);
    }

    private IsoscelesTrapezoid getRandomIsoscelentTrapezoid(Color color) {
        return new IsoscelesTrapezoid(random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1,  color);
    }
}
