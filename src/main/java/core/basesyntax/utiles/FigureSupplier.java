package core.basesyntax.utiles;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int rndValue = random.nextInt(10);
        Figure[] figures = {new Circle(rndValue),
                            new IsoscelesTrapezoid(rndValue,rndValue,rndValue),
                            new Rectangle(rndValue,rndValue),
                            new RightTriangle(rndValue,rndValue),
                            new Square(rndValue)};
        return figures[random.nextInt(figures.length)];
    }
}
