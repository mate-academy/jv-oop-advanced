package core.basesyntax;

public abstract class Figure {
    protected String color;
    protected double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();
}


