package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final double MAX_VALUE = 50;
    private static final double MIN_VALUE = 1;
    private static final int DECIMAL_FORMAT = 100;
    private static final double DEFAULT_CIRCLE_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FigureShape.values().length);
        switch (FigureShape.values()[randomFigureNumber]) {
            case SQUARE:
                return randomSquare();
            case RECTANGLE:
                return randomRectangle();
            case RIGHT_TRIANGLE:
                return randomRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return randomIsoscelesTrapezoid();
            default:
                return randomCircle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS);
    }

    private Square randomSquare() {
        double side = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE)
                * DECIMAL_FORMAT) / DECIMAL_FORMAT;
        return new Square(colorSupplier.getRandomColor(), side);
    }

    private Circle randomCircle() {
        double radius = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE)
                * DECIMAL_FORMAT) / DECIMAL_FORMAT;
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Rectangle randomRectangle() {
        double length = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE)
                * DECIMAL_FORMAT) / DECIMAL_FORMAT;
        double width = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE)
                * DECIMAL_FORMAT) / DECIMAL_FORMAT;
        return new Rectangle(colorSupplier.getRandomColor(), length, width);
    }

    private RightTriangle randomRightTriangle() {
        double firstLeg = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE)
                * DECIMAL_FORMAT) / DECIMAL_FORMAT;
        double secondLeg = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE)
                * DECIMAL_FORMAT) / DECIMAL_FORMAT;
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid randomIsoscelesTrapezoid() {
        double height = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE)
                * DECIMAL_FORMAT) / DECIMAL_FORMAT;
        double baseSide1 = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE)
                * DECIMAL_FORMAT) / DECIMAL_FORMAT;
        double baseSide2 = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE)
                * DECIMAL_FORMAT) / DECIMAL_FORMAT;
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                baseSide1, baseSide2, height);
    }
}
