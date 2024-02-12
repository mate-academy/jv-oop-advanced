package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int BOUND_OF_SIDES = 100;
    private static final int DEFAULT_RADIUS_OF_CIRCLE = 10;
    private static final int INDEX_OF_FIGURE = 5;
    private static final Random RANDOM = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figuresPool = {
                createRandomCircle(),
                createRandomRectangle(),
                createRandomIsoscelesTrapezoid(),
                createRandomSquare(),
                createRandomRightTriangle()
        };
        return figuresPool[RANDOM.nextInt(INDEX_OF_FIGURE)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS_OF_CIRCLE);
    }

    private Square createRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomSize());
    }

    private RightTriangle createRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize());
    }

    private Rectangle createRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize());
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize(),
                getRandomSize());
    }

    private Circle createRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomSize());
    }

    private int getRandomSize() {
        return RANDOM.nextInt(BOUND_OF_SIDES) + 1;
    }
}
