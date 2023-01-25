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
    private final int maxNumber = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        final int figuresNumber = 4;
        switch (random.nextInt(figuresNumber)) {
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
        final int DefaultRadius = 10;
        final String defaultColor = Color.WHITE.toString();
        return new Circle(defaultColor, DefaultRadius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(maxNumber));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(maxNumber));
    }
}
