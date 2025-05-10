package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected String color;
    protected String name;

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }
}
