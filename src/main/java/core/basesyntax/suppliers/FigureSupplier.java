package core.basesyntax.suppliers;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 9;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final FigureType[] FIGURE_ARRAY = FigureType.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private FigureType figuresType;

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE) + 1;
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_ARRAY.length);
        figuresType = FIGURE_ARRAY[figureIndex];
        Color color = colorSupplier.getRandomColor();
        String colorName = color.name().toLowerCase();

        return switch (figuresType) {
            case CIRCLE -> new Circle(getRandomSize(), colorName);
            case ISOSCELESTRAPEZOID -> new IsoscelesTrapezoid(getRandomSize(),
                    getRandomSize(), getRandomSize(), colorName);
            case RECTANGLE -> new Rectangle(getRandomSize(),
                    getRandomSize(), colorName);
            case RIGHTTRIANGLE -> new RightTriangle(getRandomSize(),
                    getRandomSize(), colorName);
            case SQUARE -> new Square(getRandomSize(), colorName);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE.name().toLowerCase());
    }
}
