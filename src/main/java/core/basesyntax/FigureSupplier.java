package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_TYPES = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int typeIndex = random.nextInt(FIGURE_TYPES);
        switch (typeIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(), colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt(), colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(),
                random.nextInt(), random.nextInt(), colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(),
                random.nextInt(), colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(),
                random.nextInt(), colorSupplier.getRandomColor());
    }
}
