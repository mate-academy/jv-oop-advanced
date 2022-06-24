package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    public Figure(String color, double sideOrRadius) {
        this.color = color;
    }
}
