package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 25;
    private static final int FIGURE_AMOUNT = 4;
    private static final int DEFAULT_NUMBER = 10;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURE_AMOUNT);
        switch (randomNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Square getRandomSquare() {
        return new Square(supplier.getRandomColor().name(),
                          random.nextInt(MIN_LENGTH, MAX_LENGTH));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(supplier.getRandomColor().name(),
                             random.nextInt(MIN_LENGTH, MAX_LENGTH),
                             random.nextInt(MIN_LENGTH, MAX_LENGTH));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(supplier.getRandomColor().name(),
                                 random.nextInt(MIN_LENGTH, MAX_LENGTH),
                                 random.nextInt(MIN_LENGTH, MAX_LENGTH));
    }

    private Circle getRandomCircle() {
        return new Circle(supplier.getRandomColor().name(),
                          random.nextInt(MIN_LENGTH, MAX_LENGTH));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(supplier.getRandomColor().name(),
                                      random.nextInt(MIN_LENGTH, MAX_LENGTH),
                                      random.nextInt(MIN_LENGTH, MAX_LENGTH));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_NUMBER);
    }
}
