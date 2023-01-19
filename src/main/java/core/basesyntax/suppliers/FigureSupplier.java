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
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int getRandomInt = new Random().nextInt(100);
    private final double getRandomDouble = new Random().nextDouble();
    private final int figureIndex = new Random().nextInt(4);

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

    private Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }

    private Figure getRandomFigure() {
        switch (figureIndex) {
            case 0:
                getRandomCircle();
                break;
            case 1:
                getRandomIsoscelesTrapezoid();
                break;
            case 2:
                getRandomRectangle();
                break;
            case 3:
                getRandomRightTriangle();
                break;
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomDouble);
        }
        return getDefaultFigure();
    }
}
