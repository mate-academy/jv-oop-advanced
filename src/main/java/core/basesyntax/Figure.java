
package core.basesyntax;

public abstract class Figure {
    protected String color;

    public Figure(String color) {
            this.color = color;
        }

        public double roundToTwoDecimals(double value) {
            return Math.round(value * 100.0) / 100.0;
    }

    public abstract double getArea();

    public abstract void draw();
}
