package core.basesyntax.supplier;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.models.Circle;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
import java.util.Random;

public class FigureSupplier {
    static final int MAX_NUMBER = 100;
    static final int FIGURES_NUMBER = 5;
    static final int DEFAULT_RADIUS = 10;
    static final String DEFAULT_COLOR = Color.WHITE.toString();
    static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    static final Random RANDOM = new Random();

    public Figure getRandomFigure() {

        switch (RANDOM.nextInt(FIGURES_NUMBER)) {
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
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextDouble(),
                RANDOM.nextDouble(),
                RANDOM.nextDouble());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextDouble(),
                RANDOM.nextDouble());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextDouble(),
                RANDOM.nextDouble());
    }

    private Figure getRandomSquare() {
        return new Square(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextInt(MAX_NUMBER));
    }

    private Figure getRandomCircle() {
        return new Circle(COLOR_SUPPLIER.getRandomColor(),
                RANDOM.nextInt(MAX_NUMBER));
    }
}
