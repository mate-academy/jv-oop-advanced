package core.basesyntax.service;

import core.basesyntax.enums.Color;
import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezium;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;

public class FigureSupplier {
    private static final int LIMIT_VALUE = 50;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = new Figure[5];
        Figure circle = new Circle(colorSupplier.getRandomColor(), Math.random() * LIMIT_VALUE);
        Figure isoscelesTrapezium = new IsoscelesTrapezium(colorSupplier.getRandomColor(),
                Math.random() * LIMIT_VALUE,
                Math.random() * LIMIT_VALUE,
                Math.random() * LIMIT_VALUE);
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                Math.random() * LIMIT_VALUE,
                Math.random() * LIMIT_VALUE);
        final Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                Math.random() * LIMIT_VALUE,
                Math.random() * LIMIT_VALUE);
        final Figure square = new Square(colorSupplier.getRandomColor(),
                Math.random() * LIMIT_VALUE);
        figures[0] = circle;
        figures[1] = isoscelesTrapezium;
        figures[2] = rectangle;
        figures[3] = rightTriangle;
        figures[4] = square;
        return figures[(int) (Math.random() * figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
