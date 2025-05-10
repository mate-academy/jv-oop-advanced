package core.basesyntax;

public abstract class Figures implements AreaCalculator, Drawable {
    protected String color;

    public Figures(String color) {
        this.color = color;
    }
}
