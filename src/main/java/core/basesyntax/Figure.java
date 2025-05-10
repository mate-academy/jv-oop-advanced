package core.basesyntax;

abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public abstract double area();

    @Override
    public abstract void draw();
}
