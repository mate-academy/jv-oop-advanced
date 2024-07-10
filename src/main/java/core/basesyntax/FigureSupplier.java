package core.basesyntax;

import static core.basesyntax.Circle.DEFAULT_RADIUS;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private Random random = new Random();
    private FigureTypeSupplier figureType = new FigureTypeSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle createCircle() {
        return new Circle(random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
    }

    public Rectangle createRectangle() {
        return new Rectangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    public IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
    }

    public Square createSquare() {
        return new Square(random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
    }

    public RightTriangle createRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomFigure() {
        switch (figureType.getRandomFigureType()) {
            case CIRCLE:
                return createCircle();
            case RECTANGLE:
                return createRectangle();
            case ISOSCELES_TRAPEZOID:
                return createIsoscelesTrapezoid();
            case SQUARE:
                return createSquare();
            case RIGHT_TRIANGLE:
                return createRightTriangle();
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name().toLowerCase());
    }
}
