package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_RADIUS = 10;
    private static final Color CIRCLE_COLOR = Color.WHITE;
    private static final int NUMBER_OF_FIGURES_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int figureIndex = random.nextInt(NUMBER_OF_FIGURES_COUNT);
        switch (figureIndex) {
            case 0:
                return getRandomSquare(color);
            case 1:
                return getRandomRectangle(color);
            case 2:
                return getRandomRightTriangle(color);
            case 3:
                return getRandomCircle(color);
            default:
                return getRandomIsoscelesTrapezoid(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_COLOR, CIRCLE_RADIUS);
    }

    private Circle getRandomCircle(Color color) {
        double radius = random.nextDouble() * 10 + 1;
        return new Circle(color, radius);
    }

    private Square getRandomSquare(Color color) {
        double side = random.nextDouble() * 10 + 1;
        return new Square(color, side);
    }

    private Rectangle getRandomRectangle(Color color) {
        double length = random.nextDouble() * 10 + 1;
        double width = random.nextDouble() * 10 + 1;
        return new Rectangle(color, length, width);
    }

    private RightTriangle getRandomRightTriangle(Color color) {
        double base = random.nextDouble() * 10 + 1;
        double height = random.nextDouble() * 10 + 1;
        return new RightTriangle(base, height, color);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid(Color color) {
        double baseA = random.nextDouble() * 10 + 1;
        double baseB = random.nextDouble() * 10 + 1;
        double height = random.nextDouble() * 10 + 1;
        return new IsoscelesTrapezoid(color, baseA, baseB, height);
    }
}
