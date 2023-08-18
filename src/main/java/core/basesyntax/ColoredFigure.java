package core.basesyntax;

public abstract class ColoredFigure implements Area, Draw {
    private String color;

    public ColoredFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
