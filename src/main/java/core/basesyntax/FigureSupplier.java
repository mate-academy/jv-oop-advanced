package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int CIRCLE_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, TypeOfFigure.CIRCLE, CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        switch (getRandomTypeOfFigure()) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case TRIANGLE:
                return getRandomRightTriangle();
            case RECTANGLE:
                return getRandomRectangle();
            case TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    private TypeOfFigure getRandomTypeOfFigure() {
        int randomNum = random.nextInt(TypeOfFigure.values().length);
        return TypeOfFigure.values()[randomNum];
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), TypeOfFigure.CIRCLE,
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), TypeOfFigure.SQUARE,
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), TypeOfFigure.TRIANGLE,
                random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), TypeOfFigure.RECTANGLE,
                random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), TypeOfFigure.TRAPEZOID,
                random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }
}
