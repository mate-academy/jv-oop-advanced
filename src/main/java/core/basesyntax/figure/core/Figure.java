package core.basesyntax.figure.core;

public abstract class Figure {
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

    public abstract double obtainTheArea();

    public abstract void drawFigure();
}
