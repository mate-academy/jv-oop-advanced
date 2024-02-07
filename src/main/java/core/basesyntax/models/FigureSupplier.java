package core.basesyntax.models;

import core.basesyntax.models.painter.Color;
import core.basesyntax.models.painter.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final double PROPERTY_MULTIPLIER = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), 10);
    }

    public Figure getRandomFigure() {
        int randFigureIndex = random.nextInt(Figures.values().length);
        return createFigure(Figures.values()[randFigureIndex]);
    }

    private Figure createFigure(Figures newFigure) {
        switch (newFigure) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble() * PROPERTY_MULTIPLIER
                );
            case ISOSCELESTRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble() * PROPERTY_MULTIPLIER,
                        random.nextDouble() * PROPERTY_MULTIPLIER,
                        random.nextDouble() * PROPERTY_MULTIPLIER
                );
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * PROPERTY_MULTIPLIER,
                        random.nextDouble() * PROPERTY_MULTIPLIER
                );
            case RIGHTTRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble() * PROPERTY_MULTIPLIER,
                        random.nextDouble() * PROPERTY_MULTIPLIER
                );
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble() * PROPERTY_MULTIPLIER
                );
            default:
                return getDefaultFigure();
        }
    }
}
