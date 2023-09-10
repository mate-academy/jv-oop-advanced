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
                int radius = getProperValue();
                return new Circle(colorSupplier.getRandomColor(), radius);

            case 2:
                int upperBase = getProperValue();
                int bottomBase = getProperValue();
                int altitude = getProperValue();
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(), upperBase, bottomBase, altitude);

            case 3:
                int rectangleHeight = getProperValue();
                int width = getProperValue();
                return new Rectangle(colorSupplier.getRandomColor(), rectangleHeight, width);

            case 4:
                int rightTriangleHeight = getProperValue();
                int base = getProperValue();
                return new RightTriangle(colorSupplier.getRandomColor(), rightTriangleHeight, base);

            case 5:
                int side = getProperValue();
                return new Square(colorSupplier.getRandomColor(), side);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_PROPERTY_VALUE);
    }
}
