package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import core.basesyntax.model.enums.Color;
import java.util.Random;

public class FigureSupplier {
    private static final Integer MAX_VALUE = 20;
    private static final Integer DEFAULT_RADIUS = 10;
    private static final Integer FIGURES_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        return switch (random.nextInt(FIGURES_COUNT)) {
            case 0 -> new Circle(new ColorSupplier().getRandomColor(),
                    random.nextInt(MAX_VALUE));
            case 1 -> new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                    random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE));
            case 2 -> new Rectangle(new ColorSupplier().getRandomColor(),
                    random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE));
            case 3 -> new RightTriangle(new ColorSupplier().getRandomColor(),
                    random.nextInt(MAX_VALUE),
                    random.nextInt(MAX_VALUE));
            default -> new Square(new ColorSupplier().getRandomColor(),
                    random.nextInt(MAX_VALUE));
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
