package core.basesyntax;

public abstract class Figure {
    private String color;
    private String figure;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public abstract void draw();
}
