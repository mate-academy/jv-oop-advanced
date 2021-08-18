package core.basesyntax.utilities;

import core.basesyntax.figure.core.Circle;
import core.basesyntax.figure.core.Figure;
import core.basesyntax.figure.core.IsoscelesTrapezoid;
import core.basesyntax.figure.core.Rectangle;
import core.basesyntax.figure.core.RightTriangle;
import core.basesyntax.figure.core.Square;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure returnFigure;
        switch (random.nextInt(5)) {
            case (0):
                returnFigure =
                        new Circle(colorSupplier.getRandomColor(), random);
                break;
            case (1):
                returnFigure =
                        new Square(colorSupplier.getRandomColor(), random);
                break;
            case (2):
                returnFigure =
                        new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random);
                break;
            case (3):
                returnFigure =
                        new Rectangle(colorSupplier.getRandomColor(), random);
                break;
            case (4):
                returnFigure =
                        new RightTriangle(colorSupplier.getRandomColor(), random);
                break;
            default:
                returnFigure = null;
        }
        return returnFigure;
    }
}
