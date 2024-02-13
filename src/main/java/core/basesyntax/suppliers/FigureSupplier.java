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
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier cs = new ColorSupplier();
        return switch (random.nextInt(FIGURE_COUNT)) {
            case 0 -> new Square(cs.getRandomColor(), getRandomDouble());
            case 1 -> new Rectangle(cs.getRandomColor(), getRandomDouble(), getRandomDouble());
            case 2 -> new RightTriangle(cs.getRandomColor(), getRandomDouble(), getRandomDouble());
            case 3 -> new Circle(cs.getRandomColor(), getRandomDouble());
            case 4 -> new IsoscelesTrapezoid(
                    cs.getRandomColor(), getRandomDouble(), getRandomDouble(), getRandomDouble());
            default -> getDefaultFigure();
        };
    }

    private double getRandomDouble() {
        return Math.round(random.nextDouble() * 100);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
