package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_INT = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(MAX_INT, Color.WHITE);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(5);

        switch (figureNumber) {
            case 0:
                return getIsoscelesTrapezoid();
            case 1:
                return getCircle();
            case 2:
                return getRightTriangle();
            case 3:
                return getRectangle();
            case 4:
                return getSquare();
            default: getDefaultFigure();
        }
        return null;
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                random.nextInt(MAX_INT),
                random.nextInt(MAX_INT),
                colorSupplier.getRandomColor()
        );
    }

    private Figure getCircle() {
        return new Circle(
                random.nextInt(MAX_INT),
                colorSupplier.getRandomColor()
        );
    }

    private Figure getRightTriangle() {
        return new RightTriangle(
                random.nextInt(MAX_INT),
                random.nextInt(MAX_INT),
                colorSupplier.getRandomColor()
        );
    }

    private Figure getRectangle() {
        return new Rectangle(
                random.nextInt(MAX_INT),
                random.nextInt(MAX_INT),
                colorSupplier.getRandomColor()
        );
    }

    private Figure getSquare() {
        return new Square(
                random.nextInt(MAX_INT),
                colorSupplier.getRandomColor()
        );
    }
}
