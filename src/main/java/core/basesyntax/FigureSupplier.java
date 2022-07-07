package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT = 100;
    private static final int RADIUS = 10;
    private static final String WHITE_COLOR = "WHITE";

    public Figure getRandomFigure(Random random, ColorSupplier colorSupplier) {
        FigureType figureType = FigureType.values()[random
                .nextInt(FigureType.values().length)];
        switch (figureType) {
            case CIRCLE:
                return getRandomCircle(random, colorSupplier);
            case SQUARE:
                return getRandomSquare(random, colorSupplier);
            case RECTANGLE:
                return getRandomRectangle(random, colorSupplier);
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle(random, colorSupplier);
            case ISOSCELES_TRAPEZOID:
            default:
                return getRandomIsoscelesTrapezoid(random, colorSupplier);
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(RADIUS);
        circle.setColor(WHITE_COLOR);
        return circle;
    }

    public Figure getRandomCircle(Random random, ColorSupplier colorSupplier) {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(LIMIT));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    public Figure getRandomSquare(Random random, ColorSupplier colorSupplier) {
        Square square = new Square();
        square.setSide(random.nextInt(LIMIT));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    public Figure getRandomRectangle(Random random, ColorSupplier colorSupplier) {
        Rectangle rectangle = new Rectangle();
        rectangle.setSideOne(random.nextInt(LIMIT));
        rectangle.setSideTwo(random.nextInt(LIMIT));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    public Figure getRandomRightTriangle(Random random, ColorSupplier colorSupplier) {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(LIMIT));
        rightTriangle.setSecondLeg(random.nextInt(LIMIT));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    public Figure getRandomIsoscelesTrapezoid(Random random, ColorSupplier colorSupplier) {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setLeg(random.nextInt(LIMIT));
        isoscelesTrapezoid.setBase(random.nextInt(LIMIT));
        isoscelesTrapezoid.setTop(random.nextInt(LIMIT));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }
}
