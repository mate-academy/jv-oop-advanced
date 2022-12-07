package core.basesyntax.suppliers;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_GEN_COUNT = 4;
    private static final int DEFAULT_COLOR_ID = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int RANDOM_FIGURE_PARAMETERS_UPPER_LIMIT = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(FIGURE_GEN_COUNT);

        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt(),
                        getRandomInt());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomInt());

        }
    }

    public Figure getWhiteCircle() {
        return new Circle(Color.values()[DEFAULT_COLOR_ID].name(), DEFAULT_CIRCLE_RADIUS);
    }

    private int getRandomInt() {
        return new Random().nextInt(RANDOM_FIGURE_PARAMETERS_UPPER_LIMIT);
    }

}
