package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final double parameter = random.nextDouble();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Figure getRandomCircle() {
        return new Circle(parameter, colorSupplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(parameter, colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(parameter, parameter,
                colorSupplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(parameter, parameter,
                colorSupplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(parameter,
                parameter, parameter, colorSupplier.getRandomColor());
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(5);
        switch (figureIndex) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomSquare();
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, colorSupplier.getRandomColor());
    }
}
