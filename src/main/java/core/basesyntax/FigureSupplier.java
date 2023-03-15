package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE = 25;
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 0:
                return getRandomSquare(color);
            case 1:
                return getRandomCircle(color);
            case 2:
                return getRandomIsoscelesTrapezoid(color);
            case 3:
                return getRandomRectangle(color);
            case 4:
                return getRandomRightTriangle(color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private Square getRandomSquare(String color) {
        return new Square(color, random.nextInt(MAX_SIDE));
    }

    private Circle getRandomCircle(String color) {
        return new Circle(color, random.nextInt(MAX_SIDE));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(color, random.nextInt(MAX_SIDE),
                random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE));
    }

    private Rectangle getRandomRectangle(String color) {
        return new Rectangle(color, random.nextInt(MAX_SIDE),
                random.nextInt(MAX_SIDE));
    }

    private RightTriangle getRandomRightTriangle(String color) {
        return new RightTriangle(color, random.nextInt(MAX_SIDE),
                random.nextInt(MAX_SIDE));
    }
}
