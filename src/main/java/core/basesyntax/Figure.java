package core.basesyntax;

public class Figure implements Measurable, Drawable {
    protected String color;

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
    }
}
