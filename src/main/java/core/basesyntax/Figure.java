package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public String getColor() {
        return color;
    } // I need this getter to get color in overrided method "draw" in every figure class

    public Figure(String color) {
        this.color = color;
    }
}
