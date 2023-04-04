package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        int randomNumber = random.nextInt(5);
        switch (randomNumber) {
            case 0:
                return createSquare();
            case 1:
                return createRightTriangle();
            case 2:
                return createRectangle();
            case 3:
                return createIsoscelesTrapezoid();
            default:
                return createCircle();
        }
    }

    public Circle getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Square createSquare() {
        return new Square(colorSupplier.getRandomColor(),
                10 * random.nextDouble());
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                10 * random.nextDouble(), 10 * random.nextDouble());
    }

    private Rectangle createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                10 * random.nextDouble(), 10 * random.nextDouble());
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                10 * random.nextDouble(), 10 * random.nextDouble());
    }

    private Circle createCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                10 * random.nextDouble());
    }
}
