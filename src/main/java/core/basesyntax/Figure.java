package core.basesyntax;

public abstract class Figure implements Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double getArea();

    public double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
