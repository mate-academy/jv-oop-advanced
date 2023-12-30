package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.FigureDrawing;

public class Figure implements AreaCalculator, FigureDrawing {
    private static final int MAX_SIZE_VALUE = 101;
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure createRAandFigure() {
        return new Figure(color);
    }

    @Override
    public void drawTheFigure() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
