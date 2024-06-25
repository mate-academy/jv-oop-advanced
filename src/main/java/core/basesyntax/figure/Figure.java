package core.basesyntax.figure;

public abstract class Figure implements AreaCalculator, Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
    }
}
