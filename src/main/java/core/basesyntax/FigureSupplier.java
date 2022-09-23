package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int BOUND = 100;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(GeometricFigure.values().length);
        GeometricFigure randomFigure = GeometricFigure.values()[index];
        switch (randomFigure) {
            case ISOSCELES_TRAPEZOID:
                return getIsoscelesTrapezoid();
            case CIRCLE:
                return getCircle();
            case SQUARE:
                return getSquare();
            case RECTANGLE:
                return getRectangle();
            default:
                return getRightTriangle();
        }
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        String colorTrapezoid = colorSupplier.getRandomColor();
        int height = random.nextInt(BOUND);
        int firstBasis = random.nextInt(BOUND);
        int secondBasis = random.nextInt(BOUND);
        return new IsoscelesTrapezoid(colorTrapezoid, height, firstBasis, secondBasis);
    }

    private Circle getCircle() {
        String colorCircle = colorSupplier.getRandomColor();
        int radius = random.nextInt(BOUND);
        return new Circle(colorCircle, radius);
    }

    private Square getSquare() {
        String colorSquare = colorSupplier.getRandomColor();
        int side = random.nextInt(BOUND);
        return new Square(colorSquare, side);
    }

    private Rectangle getRectangle() {
        String colorRectangle = colorSupplier.getRandomColor();
        int firstSide = random.nextInt(BOUND);
        int secondSide = random.nextInt(BOUND);
        return new Rectangle(colorRectangle, firstSide, secondSide);
    }

    private RightTriangle getRightTriangle() {
        String colorTriangle = colorSupplier.getRandomColor();
        int heightTriangle = random.nextInt(BOUND);
        int basisTriangle = random.nextInt(BOUND);
        return new RightTriangle(colorTriangle, heightTriangle, basisTriangle);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
