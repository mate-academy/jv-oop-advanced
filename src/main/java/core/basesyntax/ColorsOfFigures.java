package core.basesyntax;

public abstract class ColorsOfFigures implements FigureArea, Drawable {
    private String color;

    public ColorsOfFigures(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
