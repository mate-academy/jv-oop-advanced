package core.basesyntax;

public abstract class Figures implements Drawable, AreaCalculator {
    protected String color;

    public Figures(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
