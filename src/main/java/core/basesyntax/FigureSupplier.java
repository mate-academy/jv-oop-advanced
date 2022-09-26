package core.basesyntax;

import core.basesyntax.enums.Colors;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[] {new Circle(), new Square(), new Rectangle(),
                new RightTriangle(), new IsoscelesTrapezoid()};
        Figure randomFigure = figures[new Random().nextInt(FIGURE_COUNT)];
        randomFigure.setRandomProperties();
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
