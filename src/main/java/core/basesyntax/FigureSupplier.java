package core.basesyntax;

import core.basesyntax.figuretypes.Circle;
import core.basesyntax.figuretypes.IsoscelesTrapezoid;
import core.basesyntax.figuretypes.Rectangle;
import core.basesyntax.figuretypes.RightTriangle;
import core.basesyntax.figuretypes.Square;
import java.util.Random;

public class FigureSupplier {
    private static final double MAX_VALUE = 50;
    private static final double MIN_VALUE = 1;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private FigureShape[] figureShapes = FigureShape.values();

    private Square randomSquare() {
        double side = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE) * 100) / 100;
        return new Square(colorSupplier.getRandomColor(), side);
    }

    private Circle randomCircle() {
        double radius = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE) * 100) / 100;
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Rectangle randomRectangle() {
        double length = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE) * 100) / 100;
        double width = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE) * 100) / 100;
        return new Rectangle(colorSupplier.getRandomColor(), length, width);
    }

    private RightTriangle randomRightTriangle() {
        double firstLeg = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE) * 100) / 100;
        double secondLeg = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE) * 100) / 100;
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid randomIsoscelesTrapezoid() {
        double longerBase;
        double shorterBase;
        double height = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE) * 100) / 100;
        double baseSide1 = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE) * 100) / 100;
        double baseSide2 = Math.round((MAX_VALUE * random.nextDouble() + MIN_VALUE) * 100) / 100;

        if (baseSide1 > baseSide2) {
            longerBase = baseSide1;
            shorterBase = baseSide2;
        } else {
            longerBase = baseSide2;
            shorterBase = baseSide1;
        }

        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                longerBase, shorterBase, height);
    }

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(figureShapes.length);

        switch (figureShapes[randomFigureNumber]) {
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
        return new Circle(Color.WHITE.name(), 10);
    }
}
