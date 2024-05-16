package core.basesyntax;

import enums.Color;
import enums.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_UNITS = 100;
    private static final int DEFAULT_UNITS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private final Figure[] figures = Figure.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private final Random random = new Random();

    public abstracts.Figure getRandomFigure() {
        Figure randomFigure = figures[random.nextInt(figures.length)];

        switch (randomFigure) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), getRandomUnits());
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), getRandomUnits());
            case TRAPEZOID:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        getRandomUnits(),
                        getRandomUnits(),
                        getRandomUnits()
                );
            case RIGHTTRIANGLE:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        getRandomUnits(),
                        getRandomUnits()
                );
            case RECTANGLE:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        getRandomUnits(),
                        getRandomUnits()
                );
            default:
                return getDefaultFigure();
        }
    }

    public abstracts.Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_UNITS);
    }

    private int getRandomUnits() {
        return random.nextInt(MAX_UNITS + 1);
    }
}
