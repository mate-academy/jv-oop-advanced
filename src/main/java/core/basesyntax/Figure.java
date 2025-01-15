
package core.basesyntax;

public abstract class Figure {
    protected String color;

    public Figure(String color) {
            this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract void draw();

    public double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
