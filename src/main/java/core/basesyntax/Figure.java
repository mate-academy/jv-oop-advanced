package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    public static final String TEXT_COLOR = "color: ";
    public static final String TEXT_UNITS = " units, ";
    public static final String TEXT_SQ_UNITS = " sq. units, ";
    public static final String TEXT_AREA = "area: ";
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
