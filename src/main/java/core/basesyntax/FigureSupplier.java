package core.basesyntax;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_NUMBER = 6;
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_NUMBER)) {
            case 1:
                return circle();
            case 2:
                return rectangle();
            case 3:
                return square();
            case 4:
                return trapezoid();
            case 5:
                return triangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("Default: Circle", Color.WHITE.toString().toLowerCase(), 10);
    }

    private Figure circle() {
        return new Circle("Circle", getRandomColor().toLowerCase(), random.nextInt(15));
    }

    private Figure rectangle() {
        return new Rectangle("Rectangle", getRandomColor().toLowerCase(), random.nextInt(15));
    }

    private Figure square() {
        return new Square("Square", getRandomColor().toLowerCase(), random.nextInt(15));
    }

    private Figure trapezoid() {
        return new Trapezoid("Trapezoid", getRandomColor().toLowerCase(), random.nextInt(15));
    }

    private Figure triangle() {
        return new Triangle("Triangle", getRandomColor().toLowerCase(), random.nextInt(15));
    }
}
