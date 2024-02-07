package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final String DEFAULT_COLOR = "white";
    public static final double DEFAULT_FIELD_VALUE = 10;
    protected String color;

    public Figure() {
        color = "white";
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
