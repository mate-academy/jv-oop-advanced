package core.basesyntax.suppliers;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int Random_Number = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

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
        return new Random().nextInt(Random_Number);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }
}
