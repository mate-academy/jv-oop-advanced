package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int figureCount = 5;
    private final int defalteSide = 10;

    public Figure getFigure() {
        switch (getRandomFigure()) {
            case 0:
                return createCircle();
            case 1:
                return createSquare();
            case 2:
                return createRectangle();
            case 3:
                return createRightTriangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return createIsoscelesTrapezoid();
    }

    private int getRandomFigure() {
        return random.nextInt(figureCount);
    }

    private Circle createCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(defalteSide));
    }

    private Square createSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(defalteSide));
    }

    private Rectangle createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(defalteSide),
                random.nextInt(defalteSide));
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(defalteSide),
                random.nextInt(defalteSide));
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(defalteSide),
                random.nextInt(defalteSide),
                random.nextInt(defalteSide));
    }
}
