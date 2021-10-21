package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private ShapeFigure figure;
    private final int boundRandom = 10;
    private double area;
    private String color;

    public abstract void randomAttributes();

    public ShapeFigure getFigure() {
        return figure;
    }

    public void setFigure(ShapeFigure figure) {
        this.figure = figure;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBoundRandom() {
        return boundRandom;
    }
}
