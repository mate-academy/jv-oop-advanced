package core.basesyntax.model.state;

import core.basesyntax.Figure;
import core.basesyntax.model.figures.Circle;
import core.basesyntax.model.figures.IsoscelesTrapezoid;
import core.basesyntax.model.figures.Rectangle;
import core.basesyntax.model.figures.RightTriangle;
import core.basesyntax.model.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private int limitValue = random.nextInt(100);
    private final Figure[] figures = new Figure[]{
            new Circle(limitValue),
            new Rectangle(limitValue, limitValue),
            new Square(limitValue),
            new RightTriangle(limitValue, limitValue),
            new IsoscelesTrapezoid(limitValue, limitValue, limitValue)
    };

    public Figure generateFigure() {
        return figures[random.nextInt(figures.length)];
    }
}
