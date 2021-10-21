package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Trapezoid;
import core.basesyntax.figures.Triangle;
import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_NUMBER = 6;
    private static final int RANDOM_RADIUS = 15;
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
        return new Circle(getRandomColor().toLowerCase(),
                Circle.class.getSimpleName(), random.nextInt(RANDOM_RADIUS));
    }

    private Figure rectangle() {
        return new Rectangle(getRandomColor().toLowerCase(),
                Rectangle.class.getName(), random.nextInt(RANDOM_RADIUS));
    }

    private Figure square() {
        return new Square(getRandomColor().toLowerCase(),
                Square.class.getSimpleName(), random.nextInt(RANDOM_RADIUS));
    }

    private Figure trapezoid() {
        return new Trapezoid(getRandomColor().toLowerCase(),
                Trapezoid.class.getSimpleName(), random.nextInt(RANDOM_RADIUS));
    }

    private Figure triangle() {
        return new Triangle(getRandomColor().toLowerCase(),
                Triangle.class.getSimpleName(), random.nextInt(RANDOM_RADIUS));
    }
}
