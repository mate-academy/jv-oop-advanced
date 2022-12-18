package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int QUANTITY_OF_FIGURES = 5;
    private static final int MAX_SIDE_VALUE = 500;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return generateFigure(colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }

    private Figure generateFigure(Color color) {
        int numberOfFigure = random.nextInt(QUANTITY_OF_FIGURES);
        switch (numberOfFigure) {
            case 0:
                return createSquare(color);
            case 1:
                return createRectangle(color);
            case 2:
                return createRightTriangle(color);
            case 3:
                return createCircle(color);
            case 4:
            default:
                return createIsoscelesTrapezoid(color);
        }
    }

    private Figure createSquare(Color color) {
        return new Square(color, random.nextInt(MAX_SIDE_VALUE));
    }

    private Figure createRectangle(Color color) {
        return new Rectangle(color, random.nextInt(MAX_SIDE_VALUE),
                random.nextInt(MAX_SIDE_VALUE));
    }

    private Figure createRightTriangle(Color color) {
        return new RightTriangle(color, random.nextInt(MAX_SIDE_VALUE),
                random.nextInt(MAX_SIDE_VALUE));
    }

    private Figure createCircle(Color color) {
        return new Circle(color, random.nextInt(MAX_SIDE_VALUE));
    }

    private Figure createIsoscelesTrapezoid(Color color) {
        return new IsoscelesTrapezoid(color, random.nextInt(MAX_SIDE_VALUE),
                random.nextInt(MAX_SIDE_VALUE), random.nextInt(MAX_SIDE_VALUE));
    }
}
