package core.basesyntax;

public abstract class Figure implements FigureInterfaces {
    private String color;
    private double area;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void drawFigure() {

    }

    @Override
    public double getAreaFigure() {
        return 0;
    }
}
