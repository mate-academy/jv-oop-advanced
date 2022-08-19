package core.basesyntax.supliers;

import core.basesyntax.model.*;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomInt() {
        return new Random().nextInt(100);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(4);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1:
                return new Square(colorSupplier.getRandomColor(), getRandomInt());
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble());
            case 4:
            default:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());

        }
    }
}
