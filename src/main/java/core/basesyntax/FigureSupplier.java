package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_NUMBER = 100;
    private static final int NUMBER_OF_FIGURES = 4;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final Random random = new Random();

    private static Circle getRandomCircle() {
        return new Circle(ColorSupplier.getRandomColor(), random.nextInt(MAXIMUM_NUMBER));
    }

    private static IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                random.nextInt(MAXIMUM_NUMBER), random.nextInt(MAXIMUM_NUMBER),
                random.nextInt(MAXIMUM_NUMBER));
    }

    private static Square getRandomSquare() {
        return new Square(ColorSupplier.getRandomColor(), random.nextInt(MAXIMUM_NUMBER));
    }

    private static Rectangle getRandomRectangle() {
        return new Rectangle(ColorSupplier.getRandomColor(),
                random.nextInt(MAXIMUM_NUMBER), random.nextInt(MAXIMUM_NUMBER));
    }

    private static RightTriangle getRandomRightTriangle() {
        return new RightTriangle(ColorSupplier.getRandomColor(), random.nextInt(MAXIMUM_NUMBER),
                random.nextInt(MAXIMUM_NUMBER));
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return FigureSupplier.getRandomCircle();
            case 1:
                return FigureSupplier.getRandomIsoscelesTrapezoid();
            case 2:
                return FigureSupplier.getRandomSquare();
            case 3:
                return FigureSupplier.getRandomRectangle();
            default:
                return FigureSupplier.getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
