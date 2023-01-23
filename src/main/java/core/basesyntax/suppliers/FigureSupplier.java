package core.basesyntax.suppliers;

import core.basesyntax.abstractandenum.Color;
import core.basesyntax.abstractandenum.Figure;
import core.basesyntax.models.Circle;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
import java.util.Random;

public class FigureSupplier {
    private final int figures = 4;
    private final int hundred = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int getRandomInt = new Random().nextInt(hundred);
    private final double getRandomDouble = new Random().nextDouble();
    private final int figureIndex = new Random().nextInt(figures);

    public Figure getRandomFigure() {
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                getRandomSquare();
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        final int Ten = 10;
        return new Circle(Color.WHITE.toString(), Ten);
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

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomInt);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomInt);
    }
}
