package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", color: " + color);
    }
}
