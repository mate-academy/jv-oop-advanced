package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int figureCount = 5;
    private final int defalteSide = 10;
    private Color randomColor;
    private int randomSide = 0;

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
        randomSide = random.nextInt(defalteSide);
        randomColor = colorSupplier.getRandomColor();
        return new Circle(randomColor, randomSide);
    }

    private Square createSquare() {
        randomSide = random.nextInt(defalteSide);
        randomColor = colorSupplier.getRandomColor();
        return new Square(randomColor, randomSide);
    }

    private Rectangle createRectangle() {
        randomSide = random.nextInt(defalteSide);
        randomColor = colorSupplier.getRandomColor();
        return new Rectangle(randomColor, randomSide, randomSide);
    }

    private RightTriangle createRightTriangle() {
        randomSide = random.nextInt(defalteSide);
        randomColor = colorSupplier.getRandomColor();
        return new RightTriangle(randomColor, randomSide, randomSide);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        randomSide = random.nextInt(defalteSide);
        randomColor = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(randomColor, randomSide, randomSide, randomSide);
    }
}
