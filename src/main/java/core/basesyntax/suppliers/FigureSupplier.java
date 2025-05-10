package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.GeometricFigure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_VALUE = 10;
    private Random random;
    private Figure figures;
    private ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier supplier) {
        this.random = random;
        this.colorSupplier = supplier;
    }

    public GeometricFigure getRandomFigure() {
        int index = new Random().nextInt(Figure.values().length);
        figures = Figure.values()[index];
        String randomColor = colorSupplier.getRandomColor();
        switch (figures) {
            case CIRCLE:
                return new Circle(getColor(), getValue());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(getColor(), getValue(), getValue(), getValue());
            case RECTANGLE:
                return new Rectangle(getColor(), getValue(), getValue());
            case RIGHT_TRIANGLE:
                return new RightTriangle(getColor(), getValue(), getValue());
            case SQUARE:
                return new Square(getColor(), getValue());
            default: return getDefaultFigure();
        }
    }

    private String getColor() {
        return colorSupplier.getRandomColor();
    }

    private int getValue() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }

    public GeometricFigure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_VALUE);
    }
}
