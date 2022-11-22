package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;
import static core.basesyntax.RandomInt.getRandomInt;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int randomIndex = getRandomInt(5);
        switch (randomIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }
    public Figure getDefaultFigure() {
        Circle defaultFigure = new Circle();
        defaultFigure.setColor(Colors.values()[0].toString());
        defaultFigure.setRadius(10);
        return defaultFigure;
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setRandomProperties();
        circle.setColor(getRandomColor());
        return circle;
    };

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setRandomProperties();
        isoscelesTrapezoid.setColor(getRandomColor());
        return isoscelesTrapezoid;
    };

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setRandomProperties();
        rectangle.setColor(getRandomColor());
        return rectangle;
    };

    private RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setRandomProperties();
        rightTriangle.setColor(getRandomColor());
        return rightTriangle;
    };

    private Square getRandomSquare() {
        Square square = new Square();
        square.setRandomProperties();
        square.setColor(getRandomColor());
        return square;
    };
}
