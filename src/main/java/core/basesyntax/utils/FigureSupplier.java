package core.basesyntax.utils;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final String COLOR_BY_DEFAULT_FIGURE = "WHITE";
    public static final int RADIUS_BY_DEFAULT_FIGURE = 10;
    private static final int MAX_SIZE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        Figure[] figures = {
                new Circle("circle",random.nextInt(MAX_SIZE), color),
                new Square("square", random.nextInt(MAX_SIZE), color),
                new RightTriangle("rightTriangle",
                        random.nextInt(),
                        random.nextInt(MAX_SIZE),
                        color),
                new Rectangle("rectangle",
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE),
                        color),
                new IsoscelesTrapezoid("isoscelesTrapezoid",
                        random.nextInt(),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE), color)
        };

        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("circle", RADIUS_BY_DEFAULT_FIGURE, COLOR_BY_DEFAULT_FIGURE);
    }
}
