package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUM_OF_CLASSES = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAX_SIZE = 100;

    public Figure getRandomFigure() {
        switch (new Random().nextInt(NUM_OF_CLASSES)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Colors.WHITE);
    }

    public Figure getRandomCircle() {
        return new Circle(new Random().nextInt(MAX_SIZE),
                Colors.valueOf(new ColorSupplier().getRandomColor()));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                new Random().nextInt(MAX_SIZE),
                new Random().nextInt(MAX_SIZE),
                new Random().nextInt(MAX_SIZE),
                Colors.valueOf(new ColorSupplier().getRandomColor()));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(new Random().nextInt(MAX_SIZE),
                new Random().nextInt(MAX_SIZE),
                Colors.valueOf(new ColorSupplier().getRandomColor()));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(new Random().nextInt(MAX_SIZE),
                new Random().nextInt(MAX_SIZE),
                Colors.valueOf(new ColorSupplier().getRandomColor()));
    }

    public Figure getRandomSquare() {
        return new Square(new Random().nextInt(MAX_SIZE),
                Colors.valueOf(new ColorSupplier().getRandomColor()));
    }
}
