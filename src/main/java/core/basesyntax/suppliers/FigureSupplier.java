package core.basesyntax.suppliers;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 9;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private int figureIndex;
    private Figures figures;

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE) + 1;
    }

    public Figure getRandomFigure() {
        figureIndex = random.nextInt(Figures.values().length);
        figures = Figures.values()[figureIndex];
        Color color = colorSupplier.getRandomColor();

        return switch (figures) {
            case Circle -> new Circle(getRandomSize(), color.name().toLowerCase());
            case IsoscelesTrapezoid -> new IsoscelesTrapezoid(getRandomSize(),
                    getRandomSize(), getRandomSize(), color.name().toLowerCase());
            case Rectangle -> new Rectangle(getRandomSize(),
                    getRandomSize(), color.name().toLowerCase());
            case RightTriangle -> new RightTriangle(getRandomSize(),
                    getRandomSize(), color.name().toLowerCase());
            case Square -> new Square(getRandomSize(), color.name().toLowerCase());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE.name().toLowerCase());
    }
}
