package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;
    protected String name;

    public Figure(String color,String name) {
        this.color = color;
        this.name = name;
    }

}
