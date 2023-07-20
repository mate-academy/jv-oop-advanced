package core.basesyntax;

public abstract class Figure implements AreaCalculable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void draw();
}

