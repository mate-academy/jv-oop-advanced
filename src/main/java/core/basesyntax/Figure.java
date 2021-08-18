package core.basesyntax;

public abstract class Figure {
    private Color color;
    private double area;

    public Figure(Color color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return " color = " + color
                + ", area = " + area + '.';
    }

    public abstract double areaCalculator();
}
