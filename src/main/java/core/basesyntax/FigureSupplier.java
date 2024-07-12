package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color CIRCLE_COLOR = Color.WHITE;
    private static final int CIRCLE_RADIUS = 10;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        switch (random.nextInt(5)) {
            case 0:
                return createSquare(color);
            case 1:
                return createRightTriangle(color);
            case 2:
                return createRectangle(color);
            case 3:
                return createCircle(color);
            default:
                return createIsoscelesTrapezoid(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_COLOR, CIRCLE_RADIUS);
    }

    private Square createSquare(Color color) {
        return new Square(color, random.nextDouble());
    }

    private RightTriangle createRightTriangle(Color color) {
        return new RightTriangle(color, random.nextDouble(), random.nextDouble());
    }

    private Rectangle createRectangle(Color color) {
        return new Rectangle(color, random.nextDouble(), random.nextDouble());
    }

    private Circle createCircle(Color color) {
        return new Circle(color, random.nextDouble());
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(Color color) {
        return new IsoscelesTrapezoid(color, random.nextDouble(),
            random.nextDouble(), random.nextDouble());
    }
}
