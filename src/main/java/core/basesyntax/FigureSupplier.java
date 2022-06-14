package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_FIGURE_PARAMETER = 100;
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
        return new Circle(DEFAULT_CIRCLE_RADIUS,Color.WHITE);
    }

    private Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_FIGURE_PARAMETER), colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_FIGURE_PARAMETER),
                random.nextInt(MAX_FIGURE_PARAMETER), random.nextInt(MAX_FIGURE_PARAMETER),
                colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_FIGURE_PARAMETER),
                random.nextInt(MAX_FIGURE_PARAMETER), colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_FIGURE_PARAMETER),
                random.nextInt(MAX_FIGURE_PARAMETER), colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(random.nextInt(MAX_FIGURE_PARAMETER), colorSupplier.getRandomColor());
    }
}
