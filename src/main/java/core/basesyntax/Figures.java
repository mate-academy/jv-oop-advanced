package core.basesyntax;

public abstract class Figures {
    protected double area;
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public abstract void printInfo();

}
