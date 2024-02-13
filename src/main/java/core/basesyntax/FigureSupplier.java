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
    private static final int MAX_RANDOM_VALUE = 10;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int chooser = random.nextInt(FIGURE_COUNT);
        Figure figure = switch (chooser) {
            case 0 -> new Circle(random.nextInt(MAX_RANDOM_VALUE));
            case 1 -> new Square(random.nextInt(MAX_RANDOM_VALUE));
            case 2 -> new Rectangle(random.nextInt(MAX_RANDOM_VALUE),
                    random.nextInt(MAX_RANDOM_VALUE));
            case 3 -> new RightTriangle(random.nextInt(MAX_RANDOM_VALUE),
                    random.nextInt(MAX_RANDOM_VALUE));
            case 4 -> new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_VALUE),
                    random.nextInt(MAX_RANDOM_VALUE),
                    random.nextInt(MAX_RANDOM_VALUE));
            default -> getDefaultFigure();
        };
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_RADIUS);
        defaultFigure.setColor(DEFAULT_COLOR);
        return defaultFigure;
    }
}
