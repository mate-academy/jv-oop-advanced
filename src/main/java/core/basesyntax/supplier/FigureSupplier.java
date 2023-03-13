package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBERS = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_NUMBERS)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
