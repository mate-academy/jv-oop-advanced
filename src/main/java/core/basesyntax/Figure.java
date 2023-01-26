package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public abstract void draw();
}
