package core.basesyntax.model;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.name().toLowerCase();
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract void draw();
}
