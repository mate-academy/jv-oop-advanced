package core.basesyntax;

public abstract class Figure implements FigureDrawing, AreaCalculation {

    @Override
    public abstract double getArea();

    @Override
    public abstract void draw();
}
