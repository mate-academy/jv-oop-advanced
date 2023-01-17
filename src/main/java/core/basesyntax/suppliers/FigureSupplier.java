package core.basesyntax.suppliers;

import core.basesyntax.abstractAndEnum.Color;
import core.basesyntax.abstractAndEnum.Figure;
import core.basesyntax.models.Circle;

import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    final int getRandomInt = new Random().nextInt(100);
    final double getRandomDouble = new Random().nextDouble();
    final int figureIndex = new Random().nextInt(4);

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomInt);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomDouble,
                getRandomDouble,
                getRandomDouble);
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomDouble,
                getRandomDouble);
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomDouble,
                getRandomDouble);
    }

    private Figure getRandomFigure() {
        switch (figureIndex) {
            case 0:
                getRandomCircle();
            case 1:
                getRandomIsoscelesTrapezoid();
            case 2:
                getRandomRectangle();
            case 3:
                getRandomRightTriangle();
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomDouble);
        }
    }

    private Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}
