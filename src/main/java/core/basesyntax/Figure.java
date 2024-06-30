package core.basesyntax;

public class Figure implements Drawable, CalculableArea {
    protected String color;

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
