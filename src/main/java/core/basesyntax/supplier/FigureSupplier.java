package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.FigureColor;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_AMOUNT_MAX = 5;
    private static final int FIGURE_AMOUNT_MIN = 1;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = FigureColor.WHITE.name().toLowerCase();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt((FIGURE_AMOUNT_MAX - FIGURE_AMOUNT_MIN)
                + FIGURE_AMOUNT_MIN)
                + FIGURE_AMOUNT_MIN;
        Figure figure;

        switch (figureIndex) {
            case 1 -> figure = new Circle(colorSupplier.getRandomColor(),
                    random.nextDouble());
            case 2 -> figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble(), random.nextDouble(),
                    random.nextDouble());
            case 3 -> figure = new Rectangle(colorSupplier.getRandomColor(),
                    random.nextDouble(),
                    random.nextDouble());
            case 4 -> figure = new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble(),
                    random.nextDouble());
            case 5 -> figure = new Square(colorSupplier.getRandomColor(),
                    random.nextDouble());
            default -> figure = getDefaultFigure();
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
