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
    public static Figure getRandomFigure() {
        Figure[] figure = new Figure[5];
        figure[0] = new Circle();
        figure[1] = new IsoscelesTrapezoid();
        figure[2] = new Rectangle();
        figure[3] = new RightTriangle();
        figure[4] = new Square();

        Figure randomFigure = figure[new Random().nextInt(4)];
        randomFigure.setRandomParameters();
        return randomFigure;
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString());
    }
}
