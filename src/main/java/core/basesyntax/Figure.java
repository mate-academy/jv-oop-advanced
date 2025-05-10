package core.basesyntax;

public abstract class Figure implements Descriptive, Area {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    protected Figure() {
    }

    public abstract String getName();
}
