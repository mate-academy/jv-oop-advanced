package core.basesyntax.model.state;

import core.basesyntax.Figure;
import core.basesyntax.model.figures.Circle;
import core.basesyntax.model.figures.IsoscelesTrapezoid;
import core.basesyntax.model.figures.Rectangle;
import core.basesyntax.model.figures.RightTriangle;
import core.basesyntax.model.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();
    private static final Figure[] FIGURES = new Figure[]{
            new Circle(), new Rectangle(), new Square(),
            new RightTriangle(), new IsoscelesTrapezoid()
    };

    public static Figure generateFigure() {
        return FIGURES[random.nextInt(FIGURES.length)].getFigure();
    }
}
