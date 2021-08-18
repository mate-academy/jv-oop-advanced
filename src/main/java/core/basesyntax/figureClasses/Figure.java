package core.basesyntax.figureClasses;

import core.basesyntax.colors.Color;

public abstract class Figure {
    String colorOfFigure;

    public Figure(String colorOfFigure) {
        this.colorOfFigure = colorOfFigure;
    }

    public String getColorOfFigure() {
        return colorOfFigure;
    }

    public void setColorOfFigure(String colorOfFigure) {
        this.colorOfFigure = colorOfFigure;
    }

    public abstract double obtainTheArea();

    public abstract void drawFigure();
}
