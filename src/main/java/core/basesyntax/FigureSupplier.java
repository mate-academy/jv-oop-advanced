package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomGeneratedIndex = new Random().nextInt(NUMBER_OF_FIGURES);
        switch (randomGeneratedIndex) {
            case 0:
                return getRectangle();
            case 1:
                return getSquare();
            case 2:
                return getIsoscelesTrapezoid();
            case 3:
                return getCircle();
            default:
                return getRightTriangle();
        }
    }

    private Rectangle getRectangle() {
        Random random = new Random();
        Rectangle rectangle = new Rectangle(colorSupplier.getColor(),
                random.nextDouble(), random.nextDouble());
        return rectangle;
    }

    private Square getSquare() {
        Random random = new Random();
        Square square = new Square(colorSupplier.getColor(), random.nextDouble());
        return square;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        Random random = new Random();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getColor(),
                random.nextDouble(), random.nextDouble(), random.nextDouble());
        return isoscelesTrapezoid;
    }

    private Circle getCircle() {
        Random random = new Random();
        Circle circle = new Circle(colorSupplier.getColor(), random.nextDouble());
        return circle;
    }

    private RightTriangle getRightTriangle() {
        Random random = new Random();
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getColor(),
                random.nextDouble(), random.nextDouble());
        return rightTriangle;
    }
}
