package core.basesyntax;

import abstracts.Figure;
import enums.Colors;
import enums.Figures;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_UNITS = 100;
    private static final Figures[] FIGURES = Figures.values();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figures randomFigure = FIGURES[random.nextInt(FIGURES.length)];

        switch (randomFigure) {
            case SQUARE:
                return new Square(COLOR_SUPPLIER.getRandomColor(), getRandomUnits());
            case CIRCLE:
                return new Circle(COLOR_SUPPLIER.getRandomColor(), getRandomUnits());
            case TRAPEZOID:
                return new IsoscelesTrapezoid(
                        COLOR_SUPPLIER.getRandomColor(),
                        getRandomUnits(),
                        getRandomUnits(),
                        getRandomUnits()
                );
            case RIGHTTRIANGLE:
                return new RightTriangle(
                        COLOR_SUPPLIER.getRandomColor(),
                        getRandomUnits(),
                        getRandomUnits()
                );
            case RECTANGLE:
                return new Rectangle(
                        COLOR_SUPPLIER.getRandomColor(),
                        getRandomUnits(),
                        getRandomUnits()
                );
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.white, 10);
    }

    private int getRandomUnits() {
        return random.nextInt(MAX_UNITS + 1);
    }
}
