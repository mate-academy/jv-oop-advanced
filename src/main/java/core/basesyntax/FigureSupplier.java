package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private static final int countOfFigure = 5;
    private static final int sideSize = 10;

    public Figure getRandomFigure() {
        switch (getRandomTypeOfFigure()) {
            case 0:
                return createCircle();
            case 1:
                return createSquare();
            case 2:
                return createRectangle();
            case 3:
                return createRightTriangle();
            default:
                return createIsoscelesTrapezoid();
        }
    }

    private int getRandomTypeOfFigure() {
        return random.nextInt(countOfFigure);
    }

    private Circle createCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(sideSize));
    }

    private Square createSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(sideSize));
    }

    private Rectangle createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(sideSize),
                random.nextInt(sideSize));
    }

    private RightTriangle createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(sideSize),
                random.nextInt(sideSize));
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(sideSize),
                random.nextInt(sideSize),
                random.nextInt(sideSize));
    }
}
