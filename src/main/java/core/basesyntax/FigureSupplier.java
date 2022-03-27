package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_UNIT_LIMIT = 99;
    public static final int MIN_UNIT_LIMIT = 1;
    private Random random = new Random();

    private Figure circle = new Circle(getRandomValue(), getRandomColor());
    private Figure defaultCircle = new Circle(10, String.valueOf(Colors.WHITE));
    private Figure isoscelesTrapezoid = new IsoscelesTrapezoid(getRandomValue(), getRandomValue(),
            getRandomValue(), getRandomColor());
    private Figure rectangle = new Rectangle(getRandomValue(), getRandomValue(), getRandomColor());
    private Figure rightTriangle = new RightTriangle(getRandomValue(), getRandomValue(),
            getRandomColor());
    private Figure square = new Square(getRandomValue(), getRandomColor());

    private Figure[] figures = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square};

    public Figure getRandomFigure() {
        return figures[random.nextInt(FIGURE_COUNT)];
    }

    public Figure getDefaultFigure() {
        return defaultCircle;
    }

    public int getRandomValue() {
        return random.nextInt(MAX_UNIT_LIMIT) + MIN_UNIT_LIMIT;
    }

    public String getRandomColor() {
        return new ColorSupplier().getRandomColor();
    }
}
