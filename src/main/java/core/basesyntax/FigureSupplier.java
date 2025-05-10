package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureType figureType = FigureType.values()[random
                .nextInt(FigureType.values().length)];
        switch (figureType) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(MAX_RANDOM_NUMBER));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(MAX_RANDOM_NUMBER));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSideOne(random.nextInt(MAX_RANDOM_NUMBER));
        rectangle.setSideTwo(random.nextInt(MAX_RANDOM_NUMBER));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(MAX_RANDOM_NUMBER));
        rightTriangle.setSecondLeg(random.nextInt(MAX_RANDOM_NUMBER));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setLeg(random.nextInt(MAX_RANDOM_NUMBER));
        isoscelesTrapezoid.setBase(random.nextInt(MAX_RANDOM_NUMBER));
        isoscelesTrapezoid.setTop(random.nextInt(MAX_RANDOM_NUMBER));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }
}
