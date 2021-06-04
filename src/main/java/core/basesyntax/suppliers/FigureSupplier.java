package core.basesyntax.suppliers;

import core.basesyntax.Circle;
import core.basesyntax.Figure;
import core.basesyntax.IsoscelesTrapezoid;
import core.basesyntax.Rectangle;
import core.basesyntax.RightTriangle;
import core.basesyntax.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int RAND_MIN = 1;
    private static final int RAND_MAX = 5;

    public Figure getRandomFigure() {
        int randomNumber = new Random().ints(RAND_MIN, RAND_MAX).findFirst().getAsInt();
        ColorSupplier figureColor = new ColorSupplier();
        switch (randomNumber) {
            case 1: return new Circle(figureColor.getRandomColor(), randDouble());
            case 2: return new Square(figureColor.getRandomColor(), randDouble());
            case 3: return new Rectangle(figureColor.getRandomColor(), randDouble(), randDouble());
            case 4: return new RightTriangle(figureColor.getRandomColor(),
                                                                randDouble(),
                                                                randDouble());
            case 5: return new IsoscelesTrapezoid(figureColor.getRandomColor(), randDouble(),
                                                                                randDouble(),
                                                                                randDouble(),
                                                                                randDouble());
            default: return new Square(figureColor.getRandomColor(), randDouble());
        }
    }

    private double randDouble() {
        return 1 + (100 - 1) * (new Random().nextDouble());
    }
}
