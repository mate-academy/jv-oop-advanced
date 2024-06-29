package core.basesyntax;

public abstract class Figure implements AreaCalculable, Printable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }
}
