package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    static final int FIGURE_NUMBERS = 5;
    static final int DEFAULT_RADIUS = 10;
    static final String DEFAULT_COLOR = Color.WHITE.toString();
    private ColorSupplier colorSupplier;
    private int globalRandom;

    public FigureSupplier() {
    }

    public int getGlobalRandom() {
        return new Random().nextInt(FIGURE_NUMBERS);
    }

    public Figure getRandomFigure() {
        switch (globalRandom) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomDouble());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                                                getRandomDouble(), getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(),
                                    getRandomDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(),
                                        getRandomDouble());
            case 4:
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomDouble() {
        return new Random().nextInt();
    }
}
