package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected String name;
    protected String color;

    public Figure() {

    }

    public Figure(String color) {
        this.color = color;
    }

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
