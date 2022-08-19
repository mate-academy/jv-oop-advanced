package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private static final double DIVIDED_NUMBER = 2.0;
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDividedNumber() {
        return DIVIDED_NUMBER;
    }

}
