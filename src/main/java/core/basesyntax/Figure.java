package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String color;
    private double area;
    private String figureType;

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

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    @Override
    public String toString() {
        return "Figure: ";
    }

    @Override
    public void calculateArea() {

    }
}
