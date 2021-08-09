package core.basesyntax;

public abstract class Figure {
    private String color;

    public abstract void drawFigure();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
