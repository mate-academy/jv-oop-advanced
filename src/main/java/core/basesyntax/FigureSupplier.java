package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 7;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(int value) {

        switch (value) {
            case 1:
                return getDefaultFigure();
            case 2:
                return getSquare();
            case 3:
                return getRectangle();
            case 4:
                return getRightTriangle();
            default:
                return getIsoscelesTrapezoid();
        }
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

