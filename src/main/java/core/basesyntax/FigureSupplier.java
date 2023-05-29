package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE = 5;
    private static final int MAX_VALUE = 10;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    private Figure prepareRightTriangle() {
        return new RightTriangle(supplier.getRandomColor(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure prepareSquare() {
        return new Square(supplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Figure prepareIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(supplier.getRandomColor(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure prepareRectangle() {
        return new Rectangle(supplier.getRandomColor(),
                random.nextInt(MAX_VALUE),
                random.nextInt(MAX_VALUE));
    }

    private Figure prepareCircle() {
        return new Circle(supplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Figure prepareDefaultCircle() {
        return new Circle(Color.WHITE, random.nextInt(MAX_VALUE));
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE);

        switch (index) {
            case 0:
                return prepareCircle();
            case 1:
                return prepareRectangle();
            case 2:
                return prepareIsoscelesTrapezoid();
            case 3:
                return prepareSquare();
            default:
                return prepareRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return prepareDefaultCircle();
    }
}
