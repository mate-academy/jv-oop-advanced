package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Trapezoid;
import core.basesyntax.figures.Triangle;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 6;
    private static final int RANDOM_RADIUS = 15;
    private static final int DEFAULT_RADIUS = 10;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

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
        return new Circle(Circle.class.getSimpleName(),
                Color.WHITE.toString().toLowerCase(), DEFAULT_RADIUS);
    }

    private Figure circle() {
        return new Circle(colorSupplier.getRandomColor().toLowerCase(),
                Circle.class.getSimpleName(), random.nextInt(RANDOM_RADIUS));
    }

    private Figure rectangle() {
        return new Rectangle(colorSupplier.getRandomColor().toLowerCase(),
                Rectangle.class.getSimpleName(), random.nextInt(RANDOM_RADIUS));
    }

    private Figure square() {
        return new Square(colorSupplier.getRandomColor().toLowerCase(),
                Square.class.getSimpleName(), random.nextInt(RANDOM_RADIUS));
    }

    private Figure trapezoid() {
        return new Trapezoid(colorSupplier.getRandomColor().toLowerCase(),
                Trapezoid.class.getSimpleName(), random.nextInt(RANDOM_RADIUS));
    }

    private Figure triangle() {
        return new Triangle(colorSupplier.getRandomColor().toLowerCase(),
                Triangle.class.getSimpleName(), random.nextInt(RANDOM_RADIUS));
    }
}
