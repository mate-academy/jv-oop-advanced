package core.basesyntax;

public abstract class Figure implements Descriptive, Area {
    protected Shape shape;
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    protected Figure() {
    }

    public abstract String getName();

    public abstract Color getColor();
}
