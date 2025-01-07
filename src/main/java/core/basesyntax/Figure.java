package core.basesyntax;

abstract class Figure implements Drawable{
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    @Override
    public abstract double area();

    // Abstract method to draw the figure (implemented in subclasses)
    @Override
    public abstract void draw();
}
