package core.basesyntax;

public abstract class Figure implements FigureArea, Drawable {
    public static final String FORMAT_FOR_FUNCTIONAL_NUMBERS = "#0.0";
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
