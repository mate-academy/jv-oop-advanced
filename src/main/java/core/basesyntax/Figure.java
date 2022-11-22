package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    protected Color color;

    public Figure(Color color) {
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
