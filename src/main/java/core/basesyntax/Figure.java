package core.basesyntax;

public abstract class Figure implements Workable {
    protected Color color;
    protected double area;

    public Figure(Color color) {
        this.color = color;
    }
}
