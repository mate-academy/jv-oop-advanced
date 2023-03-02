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
    private static final int MAX_COUNT_FIGURES = 5;
    private static final int MAX_RANDOM_VALUE = 20;
    private final Figure circle = new Circle(10, Color.WHITE.name());
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Figure[] figures;

    {
        figures = new Figure[] {
                new Circle(random.nextInt(MAX_RANDOM_VALUE), colorSupplier.getRandomColor()),
                new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE), colorSupplier.getRandomColor()),
                new RightTriangle(random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE),
                        colorSupplier.getRandomColor()),
                new Rectangle(random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE), colorSupplier.getRandomColor()),
                new Square(random.nextInt(MAX_RANDOM_VALUE), colorSupplier.getRandomColor())};
    }

    public Figure getRandomFigure() {
        return figures[random.nextInt(MAX_COUNT_FIGURES)];
    }

    public Figure getDefaultFigure() {
        return circle;
    }
}
