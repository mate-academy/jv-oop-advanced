package core.basesyntax;

import core.basesyntax.enums.Colors;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Figure[] figures = new Figure[] {new Circle(), new Square(), new Rectangle(),
                new RightTriangle(), new IsoscelesTrapezoid()};
        Figure randomFigure = figures[new Random().nextInt(5)];
        randomFigure.setRandomProperties();
        return randomFigure;
    }

    public static Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString().toLowerCase(), 10);
    }
}
