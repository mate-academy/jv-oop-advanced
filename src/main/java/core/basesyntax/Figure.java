package core.basesyntax;

public abstract class Figure implements Area, Draw {
    private String color;
    private String figure;

    public Figure(String color, String figure) {
        this.color = color;
        this.figure = figure;
    }

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

}
