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
    private static final int FIGURE_COUNT = 5;
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figure = new Figure[FIGURE_COUNT];
        figure[0] = new Circle();
        figure[1] = new IsoscelesTrapezoid();
        figure[2] = new Rectangle();
        figure[3] = new RightTriangle();
        figure[4] = new Square();

        Figure randomFigure = figure[random.nextInt(FIGURE_COUNT)];
        randomFigure.setRandomParameters();
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString());
    }
}
