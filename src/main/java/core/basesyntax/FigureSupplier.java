package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_SIDE = 100;
    private static final int QUANTITY_FIGURE = 5;
    private static final int DEFOULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(QUANTITY_FIGURE);
        int boundFigureSide = random.nextInt(BOUND_SIDE);
        switch (index) {
            case (0):
                return new Circle(colorSupplier.getRandomColor(), boundFigureSide);
            case (1):
                return new Rectangle(colorSupplier.getRandomColor(), boundFigureSide, boundFigureSide);
            case (2):
                return new Square(colorSupplier.getRandomColor(), boundFigureSide);
            case (3):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        boundFigureSide, boundFigureSide);
            case (4):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        boundFigureSide, boundFigureSide, boundFigureSide);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(Color.WHITE.toString().toLowerCase(), DEFOULT_RADIUS);
        return circle;
    }
}

