package core.basesyntax;

public class ColorFigure implements Figure, FigureArea {
    private String color;

    public ColorFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
