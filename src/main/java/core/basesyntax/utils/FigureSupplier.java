package core.basesyntax.utils;

import core.basesyntax.geometry.Colors;
import core.basesyntax.geometry.Figure;
import core.basesyntax.geometry.figures.Circle;
import core.basesyntax.geometry.figures.IsoscelesTrapezoid;
import core.basesyntax.geometry.figures.Rectangle;
import core.basesyntax.geometry.figures.RightTriangle;
import core.basesyntax.geometry.figures.Square;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_RADIUS = 10;
    private static final String DEFAULT_COLOR = Colors.WHITE.name();
    private static final int MAX_BOARD_FOR_SIDES = 10;
    private static final int MIN_BOARD_FOR_SIDES = 1;
    private static final int MAX_BOARD_GENERATE_FIGURES = 4;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int side = random.nextInt(MAX_BOARD_FOR_SIDES + MIN_BOARD_FOR_SIDES);
        Circle circle = new Circle(colorSupplier.getRandomColor(), side);
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier
                .getRandomColor(), side, side + 2, side);
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(), side, side);
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(), side, side);
        Square square = new Square(colorSupplier.getRandomColor(), side);

        List<Figure> anotherList = Arrays.asList(circle, isoscelesTrapezoid,
                rectangle, rightTriangle, square);
        return anotherList.get(random.nextInt(MAX_BOARD_GENERATE_FIGURES));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, CIRCLE_RADIUS);
    }
}
