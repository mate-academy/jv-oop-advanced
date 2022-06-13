package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS_CIRCLE = 10;
    private static final int MAX_PARAMETER_FIGURE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[index];
        switch (figureType) {
            case CIRCLE:
                return getRandomCircle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case SQUARE:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Circle getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS_CIRCLE,Color.WHITE);
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_PARAMETER_FIGURE), colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_PARAMETER_FIGURE),
                random.nextInt(MAX_PARAMETER_FIGURE), random.nextInt(MAX_PARAMETER_FIGURE),
                colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_PARAMETER_FIGURE),
                random.nextInt(MAX_PARAMETER_FIGURE), colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_PARAMETER_FIGURE),
                random.nextInt(MAX_PARAMETER_FIGURE), colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt(MAX_PARAMETER_FIGURE), colorSupplier.getRandomColor());
    }
}
