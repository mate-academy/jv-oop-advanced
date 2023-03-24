package core.basesyntax;

public class Figure implements CalculateArea, Drawable {
    private int height;

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
    }
}
