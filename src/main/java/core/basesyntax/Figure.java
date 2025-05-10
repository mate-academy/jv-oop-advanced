package core.basesyntax;

public abstract class Figure implements Drawable, Measurable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
    }

    @Override
    public double getArea() {
        return 0;
    }
}
