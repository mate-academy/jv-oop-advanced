package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String colorFigure;

    public Figure(String colorFigure) {
        this.colorFigure = colorFigure;
    }

    public String getColorFigure() {
        return colorFigure;
    }

    public abstract void draw();
}
