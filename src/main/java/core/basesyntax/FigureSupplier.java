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
    public static final int FIGURE_COUNT = 5;
    public static final int RANDOM_LENGTH_BOUND = 10;
    public static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String figureColor = colorSupplier.getRandomColor();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return new Square(getRandomLength(), figureColor);
            case 2:
                return new Rectangle(getRandomLength(),getRandomLength(), figureColor);
            case 3:
                return new RightTriangle(getRandomLength(), getRandomLength(), figureColor);
            case 4:
                return new Circle(getRandomLength(), figureColor);
            default:
                return new IsoscelesTrapezoid(getRandomLength() + RANDOM_LENGTH_BOUND,
                        getRandomLength(), getRandomLength(), figureColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name().toLowerCase());
    }

    private int getRandomLength() {
        return random.nextInt(RANDOM_LENGTH_BOUND) + 1;
    }
}
