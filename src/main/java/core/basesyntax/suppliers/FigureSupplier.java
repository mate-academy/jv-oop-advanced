package core.basesyntax.suppliers;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int DEFAULT_RADIUS = 10;
    public static final int FIGURE_COUNT = 6;
    public static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private Figure getRandomCircle(String color, int radius) {
        Figure randomCircle = new Circle(color, radius);
        return randomCircle;
    }

    private Figure getRandomIsoscelesTrapezoid(String color,
                              double bottomBase,
                              double topBase,
                              double height) {
        Figure randomIsoscelesTrapezoid = new IsoscelesTrapezoid(color,
                bottomBase, topBase, height);
        return randomIsoscelesTrapezoid;
    }

    private Figure getRandomRectangle(String color, double width, double length) {
        Figure randomRectangle = new Rectangle(color, width, length);
        return randomRectangle;
    }

    private Figure getRandomRightTriangle(String color, int base, int height) {
        Figure randomRightTriangle = new RightTriangle(color, base, height);
        return randomRightTriangle;
    }

    private Figure getRandomSquare(String color, int side) {
        Figure randomSquare = new Square(color, side);
        return randomSquare;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        switch (figureIndex) {
            case 0:
                return getRandomCircle(colorSupplier.getRandomColor(),
                        getRandomInt());
            case 1:
                return getRandomIsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2:
                return getRandomRectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return getRandomRightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 4:
                return getRandomSquare(colorSupplier.getRandomColor(),
                        getRandomInt());
            case 5:
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(MAX_NUMBER);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}
