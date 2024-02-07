package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COUNT_FIGURES = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final String CIRCLE_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final NumberSupplier numberSupplier = new NumberSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(MAX_COUNT_FIGURES);

        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, CIRCLE_COLOR);
    }

    public Figure getRandomCircle() {
        return new Circle(numberSupplier.getMaxRandomValue(),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomSquare() {
        return new Circle(numberSupplier.getMaxRandomValue(),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(numberSupplier.getMaxRandomValue(),
                numberSupplier.getMaxRandomValue(),
                numberSupplier.getMaxRandomValue(),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomRectangle() {
        return new Rectangle(numberSupplier.getMaxRandomValue(),
                numberSupplier.getMaxRandomValue(),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomRightTriangle() {
        return new Rectangle(numberSupplier.getMaxRandomValue(),
                numberSupplier.getMaxRandomValue(),
                colorSupplier.getRandomColor());
    }
}
