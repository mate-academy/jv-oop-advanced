package core.basesyntax;

public abstract class Figure {
    public String color;

    public double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public void draw() {

    }
}


