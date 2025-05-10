package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_NUMBER = 4;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final SizeSupplier sizeSupplier = new SizeSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(MAX_RANDOM_NUMBER);

        switch (randomFigureNumber) {
            case 0:
                return getCircle();
            case 1:
                return getSquare();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            case 4:
                return getIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), sizeSupplier.getRandomSize());
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), sizeSupplier.getRandomSize());
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                sizeSupplier.getRandomSize(),
                sizeSupplier.getRandomSize());
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                sizeSupplier.getRandomSize(),
                sizeSupplier.getRandomSize());
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                sizeSupplier.getRandomSize(),
                sizeSupplier.getRandomSize(),
                sizeSupplier.getRandomSize());
    }
}
