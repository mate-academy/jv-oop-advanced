package core.basesyntax;

public abstract class Figure implements CalculatingArea {

    public abstract void draw();

    @Override
    public abstract double getArea();
}
