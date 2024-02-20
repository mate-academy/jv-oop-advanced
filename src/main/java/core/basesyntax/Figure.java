package core.basesyntax;

public abstract class Figure implements Descriptive, Area {
    protected Shape shape;
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    protected Figure() {
    }

    public abstract Shape getName();

    public abstract double getArea();

    public abstract Color getColor();
}
