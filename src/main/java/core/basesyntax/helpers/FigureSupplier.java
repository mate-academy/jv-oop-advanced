package core.basesyntax.helpers;

import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;
import core.basesyntax.interfaces.RandomNumber;
import core.basesyntax.models.Circle;
import core.basesyntax.models.Figure;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;

public class FigureSupplier implements RandomNumber {
    private static final int MAX_FIGURE_SIZE = 100;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Figures[] FIGURES = Figures.values();

    private static final int DEFAULT_RADIUS = 10;

    private static final String DEFAULT_COLOR = Colors.WHITE.name();

    public Figure getRandomFigure() {
        Figure figure = null;
        int figureInidex = getRandomNumber(Figure.RANDOM, FIGURES.length);
        if (FIGURES[figureInidex].name().equals("CIRCLE")) {
            figure = new Circle(getRandomNumber(
                    Figure.RANDOM, MAX_FIGURE_SIZE), COLOR_SUPPLIER.getRandomColor()
            );
        } else if (FIGURES[figureInidex].name().equals("SQUARE")) {
            figure = new Square(getRandomNumber(
                    Figure.RANDOM, MAX_FIGURE_SIZE), COLOR_SUPPLIER.getRandomColor()
            );
        } else if (FIGURES[figureInidex].name().equals("RECTANGLE")) {
            int width = getRandomNumber(Figure.RANDOM, MAX_FIGURE_SIZE);
            int height = getRandomNumber(Figure.RANDOM, width);
            figure = new Rectangle(width, height, COLOR_SUPPLIER.getRandomColor());
        } else if (FIGURES[figureInidex].name().equals("RIGHT_TRIANGLE")) {
            figure = new RightTriangle(
                    getRandomNumber(Figure.RANDOM, MAX_FIGURE_SIZE),
                    getRandomNumber(Figure.RANDOM, MAX_FIGURE_SIZE),
                    COLOR_SUPPLIER.getRandomColor()
            );
        } else if (FIGURES[figureInidex].name().equals("ISOSCELES_TRAPEZOID")) {
            figure = new IsoscelesTrapezoid(
                    getRandomNumber(Figure.RANDOM, MAX_FIGURE_SIZE),
                    getRandomNumber(Figure.RANDOM, MAX_FIGURE_SIZE),
                    getRandomNumber(Figure.RANDOM, MAX_FIGURE_SIZE),
                    COLOR_SUPPLIER.getRandomColor()
            );
        }
        return figure;
    }

    public Circle getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
