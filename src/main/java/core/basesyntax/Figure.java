package core.basesyntax;

public class Figure implements Drawble, AreaCalculator {
    protected String color;

    @Override
    public void draw() {
    }

    @Override
    public double getArea() {
        return 0;
    }
}
