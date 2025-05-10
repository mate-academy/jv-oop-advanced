package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_SIDE = 100;
    private static final int QUANTITY_FIGURE = 5;
    private static final int DEFOULT_RADIUS = 10;
    private static final String DEFOULT_COLOR = Color.WHITE.toString().toLowerCase();
    private final Random random = new Random();
    private int index = random.nextInt(QUANTITY_FIGURE);
    private int boundFigureSide = random.nextInt(BOUND_SIDE);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (index) {
            case (0):
                return getRandomCircle();
            case (1):
                return getRandomRectangle();
            case (2):
                return getRandomSquare();
            case (3):
                return getRandomTriangle();
            case (4):
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), boundFigureSide);
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), boundFigureSide,
                boundFigureSide);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), boundFigureSide);
    }

    private Figure getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                boundFigureSide, boundFigureSide);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                boundFigureSide, boundFigureSide, boundFigureSide);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFOULT_COLOR, DEFOULT_RADIUS);
    }
}

