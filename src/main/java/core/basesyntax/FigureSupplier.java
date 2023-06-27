package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_NUM = 10;
    private static final int NUM_OF_FIGURES = 5;
    private static final double DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUM_OF_FIGURES)) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    private Square getRandomSquare() {
        return new Square(color.getRandomColor(), random.nextDouble() * MAX_NUM);
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(color.getRandomColor(), random.nextDouble() * MAX_NUM,
                   random.nextDouble() * MAX_NUM);
    }

    private Circle getRandomCircle() {
        return new Circle(color.getRandomColor(), random.nextDouble() * MAX_NUM);
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(color.getRandomColor(), random.nextDouble() * MAX_NUM,
                        random.nextDouble() * MAX_NUM);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(color.getRandomColor(), random.nextDouble() * MAX_NUM,
                          random.nextDouble() * MAX_NUM, random.nextDouble() * MAX_NUM);
    }
}
