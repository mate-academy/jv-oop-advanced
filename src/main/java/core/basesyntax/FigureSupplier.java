package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Trapezoid;
import core.basesyntax.figures.Triangle;
import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int RANDOM_COUNTER = 6;
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(RANDOM_COUNTER)) {
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
        return new Circle("Default: Circle", "WHITE", 10);
    }

    private Figure circle() {
        return new Circle("Circle", getRandomColor(), random.nextInt(15));
    }

    private Figure rectangle() {
        return new Rectangle("Rectangle", getRandomColor(), random.nextInt(15));
    }

    private Figure square() {
        return new Square("Square", getRandomColor(), random.nextInt(15));
    }

    private Figure trapezoid() {
        return new Trapezoid("Trapezoid", getRandomColor(), random.nextInt(15));
    }

    private Figure triangle() {
        return new Triangle("Triangle", getRandomColor(), random.nextInt(15));
    }
}
