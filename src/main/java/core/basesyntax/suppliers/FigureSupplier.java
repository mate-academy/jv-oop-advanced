package core.basesyntax.suppliers;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.Square;
import core.basesyntax.figure.RightTriangle;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    public final int FIGURE_COUNT = 4;
    public final int RANDOM_NUMBER = 100;

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(FIGURE_COUNT);
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
                        getRandomInt(),
                        getRandomInt());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomInt());
        }
    }

    private int getRandomInt() {
        return new Random().nextInt(RANDOM_NUMBER);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}
