package core.basesyntax.suppliers;

import core.basesyntax.models.Circle;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Figure;
import core.basesyntax.models.Square;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(4);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomDouble());
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(100);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}
