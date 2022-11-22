package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    public abstract void draw();

    @Override
    public double getArea() {
        return 0;
    }
}
