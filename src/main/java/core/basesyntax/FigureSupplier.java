package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Class[] figure = {Circle.class, Square.class, RightTriangle.class,
            Rectangle.class, IsoscelesTrapezoid.class};

    public Figure getRandomFigure() {
        int indexPossibleClass = random.nextInt(figure.length);
        Class randomClass = figure[indexPossibleClass];
        switch (randomClass.getSimpleName()) {
            case "Circle":
                return generateNewCircle();
            case "Square":
                return generateNewSquare();
            case "RightTriangle":
                return generateNewRightTriangle();
            case "Rectangle":
                return generateNewRectangle();
            default:
                return generateNewIsoscelesTrapezoid();
        }
    }

    private IsoscelesTrapezoid generateNewIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble(), random.nextDouble());
    }

    private Rectangle generateNewRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
    }

    private RightTriangle generateNewRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(), random.nextDouble());
    }

    private Square generateNewSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextDouble());
    }

    private Circle generateNewCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(Locale.ROOT), DEFAULT_RADIUS);
    }
}
