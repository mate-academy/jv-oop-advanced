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
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int chooser = random.nextInt(FIGURE_COUNT);
        Figure figure = getDefaultFigure();
        switch (chooser) {
            case 0:
                figure = new Circle(random.nextInt(MAX_RANDOM_VALUE) + 1);
                break;
            case 1:
                figure = new Square(random.nextInt(MAX_RANDOM_VALUE) + 1);
                break;
            case 2:
                figure = new Rectangle(random.nextInt(MAX_RANDOM_VALUE) + 1, random.nextInt(MAX_RANDOM_VALUE) + 1);
                break;
            case 3:
                figure = new RightTriangle(random.nextInt(MAX_RANDOM_VALUE) + 1, random.nextInt(MAX_RANDOM_VALUE) + 1);
                break;
            case 4:
                figure = new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
                break;
            default:

        }
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_RADIUS);
        defaultFigure.setColor(Color.WHITE.name());
        return defaultFigure;
    }
}
