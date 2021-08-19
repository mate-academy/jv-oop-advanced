package core.basesyntax;

public abstract class Figure implements Drawable, FigureArea {
    private String color;

    void setColor(String color) {
        this.color = color;
    }

    public Figure(String figureColor) {
        this.color = figureColor;
    }

    String getColor() {
        return this.color;
    }
}
