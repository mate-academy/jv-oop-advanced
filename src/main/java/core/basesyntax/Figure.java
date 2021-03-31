package core.basesyntax;

public abstract class Figure implements Drawable, CalsulateArea {
    private String color;
    private String nameFigures;

    public Figure(String color, String nameFigures) {
        this.color = color;
        this.nameFigures = nameFigures;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNameFigures() {
        return nameFigures;
    }

    public void setNameFigures(String nameFigures) {
        this.nameFigures = nameFigures;
    }
}
