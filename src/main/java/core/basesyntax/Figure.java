package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;
    protected double sideOrRadius;
    protected double secondSide;

    public Figure(String color, double sideOrRadius) {
        this.color = color;
        this.sideOrRadius = sideOrRadius;
    }

    public Figure(String color, double firstSide, double secondSide) {
        this.color = color;
        this.sideOrRadius = firstSide;
        this.secondSide = secondSide;
    }
}
