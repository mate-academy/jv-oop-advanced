package core.basesyntax.service;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.variables.Color;
import core.basesyntax.variables.FigureType;
import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final double DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int index = RANDOM.nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[index];
        Color color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case SQUARE -> new Square(color, RANDOM.nextDouble());
            case RECTANGLE -> new Rectangle(
                    color,
                    RANDOM.nextDouble(),
                    RANDOM.nextDouble()
            );
            case RIGHT_TRIANGLE -> new RightTriangle(
                    color,
                    RANDOM.nextDouble(),
                    RANDOM.nextDouble()
            );
            case CIRCLE -> new Circle(
                    color,
                    RANDOM.nextDouble()
            );
            default -> new IsoscelesTrapezoid(
                    color,
                    RANDOM.nextDouble(),
                    RANDOM.nextDouble(),
                    RANDOM.nextDouble()
            );
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
