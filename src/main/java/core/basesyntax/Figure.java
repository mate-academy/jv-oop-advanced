package core.basesyntax;

public abstract class Figure implements AreaCalculator, DrowFigure {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String drow() {
        return null;
    }

}
