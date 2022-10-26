package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_SIDE = 100;
    private static final int QUANTITY_FIGURE = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(QUANTITY_FIGURE);
        int boundFigureSide = random.nextInt(BOUND_SIDE);
        if (index == 1) {
            return new Circle(colorSupplier.getRandomColor(), boundFigureSide);
        }
        if (index == 2) {
            return new Rectangle(colorSupplier.getRandomColor(), boundFigureSide, boundFigureSide);
        }
        if (index == 3) {
            return new Square(colorSupplier.getRandomColor(),boundFigureSide);
        }
        if (index == 4) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    boundFigureSide, boundFigureSide);
        }
        if (index == 5) {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    boundFigureSide, boundFigureSide, boundFigureSide);
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle("white", 10);
        return circle;
    }
}

