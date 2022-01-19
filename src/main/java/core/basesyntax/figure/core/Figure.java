package core.basesyntax.figure.core;

import core.basesyntax.figure.interfaces.AreaCalculator;
import core.basesyntax.figure.interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String colorOfFigure;

    public Figure(String colorOfFigure) {
        this.colorOfFigure = colorOfFigure;
    }

    public String getColorOfFigure() {
        return colorOfFigure;
    }

    public void setColorOfFigure(String colorOfFigure) {
        this.colorOfFigure = colorOfFigure;
    }
}
