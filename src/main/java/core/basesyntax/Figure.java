package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected Color color = new ColorSupplier().getRandomColor();

    public Color getColor() {
        return color;
    }

    @Override
    public abstract double area();

    @Override
    public abstract void draw();
}
