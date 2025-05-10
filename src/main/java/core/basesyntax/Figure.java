package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String name;
    protected Color color;

    Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public abstract double calculatorArea();

    public abstract void draw();
}
