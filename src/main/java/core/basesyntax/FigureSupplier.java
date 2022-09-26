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
    private static final int MAX_FIGURE_FIELD_LENGTH = 127;
    private static final Random random = new Random();

    public Figure getRandomFigure(int figureNum, String figureColor) {
        switch (figureNum) {
            case 0: return new Circle(random.nextInt(MAX_FIGURE_FIELD_LENGTH), figureColor);
            case 1: return new IsoscelesTrapezoid(random.nextInt(MAX_FIGURE_FIELD_LENGTH),
                    random.nextInt(MAX_FIGURE_FIELD_LENGTH),
                    random.nextInt(MAX_FIGURE_FIELD_LENGTH), figureColor);
            case 2: return new Rectangle(random.nextInt(MAX_FIGURE_FIELD_LENGTH),
                    random.nextInt(MAX_FIGURE_FIELD_LENGTH), figureColor);
            case 3: return new RightTriangle(random.nextInt(MAX_FIGURE_FIELD_LENGTH),
                    random.nextInt(MAX_FIGURE_FIELD_LENGTH), figureColor);
            case 4: return new Square(random.nextInt(MAX_FIGURE_FIELD_LENGTH), figureColor);
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, Color.WHITE.name());
    }
}
