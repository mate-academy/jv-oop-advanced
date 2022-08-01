package core.basesyntax.supplier;

import core.basesyntax.enums.FigureTypeSelector;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_MAX_COUNT = 10;
    private static final int FIGURE_MIN_COUNT = 1;
    private static final int MAX_RANDOM_VALUE = 5;
    private final ColorSupplier colorSupplier;
    private final Circle circle = new Circle("white", FIGURE_MAX_COUNT);

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public int getRandomFigureProperties() {
        return new Random().nextInt(FIGURE_MAX_COUNT) + FIGURE_MIN_COUNT;
    }

    public Figure getRandomFigure() {
        int randomFigureNumber = new Random().nextInt(MAX_RANDOM_VALUE) + 1;
        FigureTypeSelector[] values = FigureTypeSelector.values();
        FigureTypeSelector value = values[randomFigureNumber];
        if (value.equals(FigureTypeSelector.CIRCLE)) {
            return new Circle(colorSupplier.getRandomColor(), getRandomFigureProperties());
        }
        if (value.equals(FigureTypeSelector.ISOSCELES_TRAPEZOID)) {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomFigureProperties(),
                    getRandomFigureProperties(),
                    getRandomFigureProperties());
        }
        if (value.equals(FigureTypeSelector.RECTANGLE)) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    getRandomFigureProperties(),
                    getRandomFigureProperties());
        }
        if (value.equals(FigureTypeSelector.RIGHT_TRIANGLE)) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomFigureProperties(),
                    getRandomFigureProperties());
        }
        if (value.equals(FigureTypeSelector.SQUARE)) {
            return new Square(colorSupplier.getRandomColor(), getRandomFigureProperties());
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return circle;
    }
}
