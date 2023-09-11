package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_OF_FIGURES = 5;
    private static final int MAX = 100;
    private static final int DEFAULT_FIGURE_PROPERTY_VALUE = 10;
    private static final Color DEFAULT_FIGURE_COLOR = Color.WHITE;
    private Random magic = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getProperValue() {
        return magic.nextInt(MAX) + 1;
    }

    public Figure getRandomFigure() {
        int typeOfFigure = magic.nextInt(COUNT_OF_FIGURES) + 1;

        switch (typeOfFigure) {
            case 1:
                return getRandomCircle();

            case 2:
                return getRandomIsoscelesTrapezoid();

            case 3:
                return getRandomRectangle();

            case 4:
                return getRandomRightTriangle();

            case 5:
                return getRandomSquare();

            default:
                return getDefaultFigure();
        }
    }

    private Circle getRandomCircle() {
        int radius = getProperValue();
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Square getRandomSquare() {
        int side = getProperValue();
        return new Square(colorSupplier.getRandomColor(), side);
    }

    private RightTriangle getRandomRightTriangle() {
        int rightTriangleHeight = getProperValue();
        int base = getProperValue();
        return new RightTriangle(colorSupplier.getRandomColor(), rightTriangleHeight, base);
    }

    private Rectangle getRandomRectangle() {
        int rectangleHeight = getProperValue();
        int width = getProperValue();
        return new Rectangle(colorSupplier.getRandomColor(), rectangleHeight, width);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int upperBase = getProperValue();
        int bottomBase = getProperValue();
        int altitude = getProperValue();
        return new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(), upperBase, bottomBase, altitude);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_PROPERTY_VALUE);
    }

}
