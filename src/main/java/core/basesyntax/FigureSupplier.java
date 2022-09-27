package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int CIRCLE_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_FIGURE_FIELD_LENGTH = 127;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    private int getRandomValue() {
        return random.nextInt(MAX_FIGURE_FIELD_LENGTH);
    }

    public Figure getRandomFigure() {
        int figureNum = random.nextInt(FIGURE_COUNT);
        String figureColor = colorSupplier.getRandomColor();

        switch (figureNum) {
            case 0:
                return new Circle(getRandomValue(), figureColor);
            case 1:
                return new IsoscelesTrapezoid(getRandomValue(), getRandomValue(),
                    getRandomValue(), figureColor);
            case 2:
                return new Rectangle(getRandomValue(), getRandomValue(), figureColor);
            case 3:
                return new RightTriangle(getRandomValue(), getRandomValue(), figureColor);
            default:
                return new Square(getRandomValue(), figureColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, Color.WHITE.name());
    }
}
