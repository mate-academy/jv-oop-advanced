package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return getDefaultCircle();
    }

    private Circle getDefaultCircle() {
        return new Circle(Figure.DEFAULT_COLOR, Circle.DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        int radius = random.nextInt(Circle.MAX_RADIUS);
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int height = random.nextInt(IsoscelesTrapezoid.MAX_HEIGHT);
        int upperBase = random.nextInt(IsoscelesTrapezoid.MAX_UPPER_BASE);
        int lowerBase = random.nextInt(IsoscelesTrapezoid.MAX_LOWER_BASE);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), height, upperBase, lowerBase);
    }

    private Rectangle getRandomRectangle() {
        int firstSide = random.nextInt(Rectangle.MAX_FIRST_SIDE);
        int secondSide = random.nextInt(Rectangle.MAX_SECOND_SIDE);
        return new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(RightTriangle.MAX_FIRST_LEG);
        int secondLeg = random.nextInt(RightTriangle.MAX_SECOND_LEG);
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(Square.MAX_SIDE);
        return new Square(colorSupplier.getRandomColor(), side);
    }
}
