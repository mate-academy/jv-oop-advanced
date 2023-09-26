package core.basesyntax.randomizer;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.Figures;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public Figure getRandomFigure() {
        Figures figureName = Figures.values()[random.nextInt(Figures.values().length)];

        switch (figureName) {
            case CIRCLE:
                return new Circle(random.nextInt(MAX_VALUE),
                                  colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE),
                                       random.nextInt(MAX_VALUE),
                                       random.nextInt(MAX_VALUE),
                                       colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextInt(MAX_VALUE),
                                     random.nextInt(MAX_VALUE),
                                     colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextInt(MAX_VALUE),
                                         random.nextInt(MAX_VALUE),
                                         colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(random.nextInt(MAX_VALUE),
                                  colorSupplier.getRandomColor());
            default:
                return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
