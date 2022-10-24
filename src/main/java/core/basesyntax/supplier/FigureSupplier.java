package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int COLOR_NUMBER = 5;
    private static final int RANDOM_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(COLOR_NUMBER);
        switch (figureIndex) {
            case 0:
                return createCircle(colorSupplier.getRandomColor(), getRandom());
            case 1:
                return createIsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble(), getRandomDouble());
            case 2:
                return createRectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble());
            case 3:
                return createSquare(colorSupplier.getRandomColor(), getRandom());
            case 4:
            default:
                return createRightTriangle(colorSupplier.getRandomColor(),
                        getRandomDouble(), getRandomDouble());
        }
    }

    private int getRandom() {
        return new Random().nextInt(RANDOM_NUMBER);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    private Figure createCircle(String color, int radius) {
        return new Circle(color, radius);
    }

    private Figure createIsoscelesTrapezoid(String color,
                                            double height, double topSide, double bottomSide) {
        return new IsoscelesTrapezoid(color, height, topSide, bottomSide);
    }

    private Figure createRectangle(String color, double width, double length) {
        return new Rectangle(color, width, length);
    }

    private Figure createSquare(String color, int sideLength) {
        return new Square(color, sideLength);
    }

    private Figure createRightTriangle(String color, double firstLeg, double secondLeg) {
        return new RightTriangle(color, firstLeg, secondLeg);
    }
}
