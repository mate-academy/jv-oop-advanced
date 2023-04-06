package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {

    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color.toLowerCase();
    }
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
