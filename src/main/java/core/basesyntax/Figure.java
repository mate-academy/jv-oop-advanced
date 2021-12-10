package core.basesyntax;

public abstract class Figure implements AreaCalculator, Draw {
    private String name;
    private String color;

    public abstract String getName();

    @Override
    public abstract double getArea();

    @Override
    public abstract String getDraw();

    public abstract String toString();
}
