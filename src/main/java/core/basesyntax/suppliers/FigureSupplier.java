package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_LENGTH = 20;
    private static final int MIN_LENGTH = 1;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        Figure[] figures = new Figure[]{
            new Circle(color, getRandomLength()),
            new Square(color, getRandomLength()),
            new Rectangle(color, getRandomLength(), getRandomLength()),
            new RightTriangle(color, getRandomLength(), getRandomLength()),
            new IsoscelesTrapezoid(color, getRandomLength(), getRandomLength(), getRandomLength())
        };

        int index = random.nextInt(figures.length);
        return figures[index];
    }

    private int getRandomLength() {
        return random.nextInt(MAX_LENGTH) + MIN_LENGTH;
    }
}
