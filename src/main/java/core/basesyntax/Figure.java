package core.basesyntax;

public abstract class Figure implements Painter, AreaCalculator {
    protected String color;
    protected String name;

    public Figure() {
        name = getClass().getSimpleName();
    }
}
