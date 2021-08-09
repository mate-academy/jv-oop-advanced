package core.basesyntax;

public abstract class Figure implements FigureDrawer {
    private String nameFigure;
    private String colour;

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}


