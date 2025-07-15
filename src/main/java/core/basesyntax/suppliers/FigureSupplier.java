package core.basesyntax.suppliers;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.DefaultCircle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{
                new Circle(),
                new Rectangle(),
                new IsoscelesTrapezoid(),
                new Square(),
                new RightTriangle()
        };

        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        Figure defaultCircle = new DefaultCircle();
        return defaultCircle;
    }
}
