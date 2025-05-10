package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

    public String getColor() {
        return color;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public abstract void draw();
}
