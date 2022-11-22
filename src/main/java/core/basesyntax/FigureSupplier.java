package core.basesyntax;

import static core.basesyntax.RandomInt.getRandomInt;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class FigureSupplier {

    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int randomIndex = getRandomInt(FIGURE_COUNT);
        switch (randomIndex) {
            case 0: {
                return getRandomCircle();
            }
            case 1: {
                return getRandomIsoscelesTrapezoid();
            }
            case 2: {
                return getRandomRectangle();
            }
            case 3: {
                return getRandomRightTriangle();
            }
            default: {
                return getRandomSquare();
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle defaultFigure = new Circle();
        defaultFigure.setColor(Colors.white.name());
        defaultFigure.setRadius(DEFAULT_RADIUS);
        return defaultFigure;
    }

    private Circle getRandomCircle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Circle circle = new Circle();
        circle.setRandomProperties();
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        ColorSupplier colorSupplier = new ColorSupplier();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setRandomProperties();
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Rectangle getRandomRectangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Rectangle rectangle = new Rectangle();
        rectangle.setRandomProperties();
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private RightTriangle getRandomRightTriangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setRandomProperties();
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Square getRandomSquare() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Square square = new Square();
        square.setRandomProperties();
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }
}
