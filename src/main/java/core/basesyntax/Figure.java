package core.basesyntax;

public abstract class Figure implements IFigureToString,IFigureGetArea {
    protected String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract String toString();

    @Override
    public abstract double getArea();
}
