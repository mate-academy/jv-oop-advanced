package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {

    private double trapezoidHeight;
    private String color;
    private String figure;
    private double sideA;
    private double sideB;

    public Figure(String color) {
        this.color = color;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getTrapezoidHeight() {
        return trapezoidHeight;
    }

    public void setTrapezoidHeight(double trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }
}

