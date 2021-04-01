package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String colorFigure;
    private String nameFigure;

    public Figure(String color, String name) {
        this.colorFigure = color;
        this.nameFigure = name;
    }

    public String getColorFigure() {
        return colorFigure;
    }

    public void setColorFigure(String colorFigure) {
        this.colorFigure = colorFigure;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }
}
