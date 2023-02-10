package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected final String defaultColor = "WHITE";
    protected String color;

    public Figure() {
        this.color = defaultColor;
    }

    public Figure(String color) {
        this.color = color;
    }
}
