package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: " + getClass().getSimpleName()
                + ", color: " + color.toLowerCase()
                + ", ";
    }

    @Override
    public abstract void draw();

    @Override
    public abstract double getArea();
}
