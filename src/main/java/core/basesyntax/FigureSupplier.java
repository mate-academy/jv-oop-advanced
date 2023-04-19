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
        if (Circle.class.equals(randomClass)) {
            return generateNewCircle();
        } else if (Square.class.equals(randomClass)) {
            return generateNewSquare();
        } else if (RightTriangle.class.equals(randomClass)) {
            return generateNewRightTriangle();
        } else if (Rectangle.class.equals(randomClass)) {
            return generateNewRectangle();
        } else {
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
        return new Circle(PossibleColors.WHITE.name().toLowerCase(Locale.ROOT), DEFAULT_RADIUS);
    }
}
