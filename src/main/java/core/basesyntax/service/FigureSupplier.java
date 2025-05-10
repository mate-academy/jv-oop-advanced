package core.basesyntax.service;

import core.basesyntax.enums.Color;
import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    private static final int MIN_SIDE_LENGTH = 1;
    private static final int MAX_SIDE_LENGTH = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getColor(), getRandomSize());
            case 1:
                return new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                        getRandomSize(), colorSupplier.getColor());
            case 2:
                return new Square(getRandomSize(),colorSupplier.getColor());
            case 3:
                return new Rectangle(getRandomSize(), getRandomSize(),colorSupplier.getColor());
            case 4:
                return new RightTriangle(getRandomSize(), getRandomSize(),colorSupplier.getColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomSize() {
        return MIN_SIDE_LENGTH + random.nextInt(MAX_SIDE_LENGTH);
    }
}
