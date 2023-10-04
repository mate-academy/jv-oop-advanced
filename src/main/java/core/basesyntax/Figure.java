package core.basesyntax;

public abstract class Figure implements Drawable, HasArea {
    private String color;
    private double area;
    private String figureType;

    public Figure(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public String getFigureType() {
        return figureType;
    }
}
