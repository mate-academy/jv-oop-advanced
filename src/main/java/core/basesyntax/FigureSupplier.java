package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int index = new Random().nextInt(Figure.NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return new Circle().getRandomParameters();
            case 1:
                return new IsoscelesTrapezoid().getRandomParameters();
            case 2:
                return new Rectangle().getRandomParameters();
            case 3:
                return new RightTriangle().getRandomParameters();
            case 4:
                return new Square().getRandomParameters();
            default:
                break;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.white, 10);
    }
}
