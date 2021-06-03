package core.basesyntax.suppliers;

import core.basesyntax.Circle;
import core.basesyntax.Figure;
import core.basesyntax.IsoscelesTrapezoid;
import core.basesyntax.Rectangle;
import core.basesyntax.RightTriangle;
import core.basesyntax.Square;
import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int RAND_MIN = 1;
    private static final int RAND_MAX = 5;

    public Figure getRandomFigure() {
        int randomNumber = new Random().ints(RAND_MIN, RAND_MAX).findFirst().getAsInt();
        switch (randomNumber) {
            case 1: return new Circle(getRandomColor(), randDouble());
            case 2: return new Square(getRandomColor(), randDouble());
            case 3: return new Rectangle(getRandomColor(), randDouble(), randDouble());
            case 4: return new RightTriangle(getRandomColor(), randDouble(), randDouble());
            case 5: return new IsoscelesTrapezoid(getRandomColor(), randDouble(), randDouble(),
                                                                    randDouble(), randDouble());
            default: return new Square(getRandomColor(), randDouble());
        }
    }

    private double randDouble() {
        return 1 + (100 - 1) * (new Random().nextDouble());
    }
}
