package core.basesyntax.suppliers;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_TYPES = 5;
    public static final double MIN_SIZE = 1.0d;
    public static final double MAX_SIZE = 24.0d;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    Figure figure;

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_TYPES)) {
            case 0: figure = getRandomIsoscelesTrapezoid();
                break;
            case 1: figure = getRandomRectangle();
                break;
            case 2: figure = getRandomRightTriangle();
                break;
            case 3: figure = getRandomSquare();
                break;
            case 4: figure = getRandomCircle();
            default:
        }
        return null;
    }

    // this method should always return white circle with radius 10
     public Figure getDefaultFigure() {
         return null;
     }

     private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble(MIN_SIZE, MAX_SIZE),
                random.nextDouble(MIN_SIZE, MAX_SIZE),
                random.nextDouble(MIN_SIZE, MAX_SIZE));
     }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(MIN_SIZE, MAX_SIZE),
                random.nextDouble(MIN_SIZE, MAX_SIZE));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(MIN_SIZE, MAX_SIZE),
                random.nextDouble(MIN_SIZE, MAX_SIZE));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextDouble(MIN_SIZE, MAX_SIZE));
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextDouble(MIN_SIZE, MAX_SIZE));
    }
}
