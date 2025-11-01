package core.basesyntax;

public abstract class Figure implements AreaCalculable, Drawable {
    protected Color color;

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getDraw() {
        return "";
    }
}
