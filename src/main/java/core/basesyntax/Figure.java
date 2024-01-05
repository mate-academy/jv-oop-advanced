package core.basesyntax;

public abstract class Figure implements Area {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void draw();

    @Override
    public int obtainArea() {
        return 0;
    }
}
