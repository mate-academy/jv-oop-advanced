package core.basesyntax;

public abstract class Figure implements Draw {
    private FigureType figure;
    private Color color;
    private double area;

    public void setFigure(FigureType figure) {
        this.figure = figure;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getFigure() {
        return figure.name().toLowerCase();
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public abstract double getCalculatedArea();
}
