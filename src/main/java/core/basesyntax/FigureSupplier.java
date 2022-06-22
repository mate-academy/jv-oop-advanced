package core.basesyntax;

import java.util.Random;

public final class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Color white = Color.WHITE;
    private static final int defaultRadius = 10;
    private static final int MAX_RANDOM_INDEX = 5;
    private static final int MAX_RANDOM_NUMBER = 100;

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_RANDOM_INDEX);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),getRandomNumber());
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber(),
                getRandomNumber());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),getRandomNumber(),getRandomNumber());
    }

    public RightTriangle getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber());
    }

    public Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),getRandomNumber());
    }

    private int getRandomNumber() {
        return new Random().nextInt(MAX_RANDOM_NUMBER);
    }

    public Figure getDefaultFigure() {

        return new Circle(white.name(),defaultRadius);
    }
}
