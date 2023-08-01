package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract void draw();

    @Override
    public abstract double getArea();
}
