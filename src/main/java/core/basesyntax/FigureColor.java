package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public FigureColor(String color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
