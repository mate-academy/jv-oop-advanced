package core.basesyntax;

public abstract class Figure implements Drawable, Areable {
    public static final int FIGURES_NUMBER = 5;
    protected String name;
    protected Color color;

    Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();
}
