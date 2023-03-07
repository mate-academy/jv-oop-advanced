package core.basesyntax;

public abstract class Figure implements Drawable,CalcArea {
    protected Color color;

    public Figure() {
    }

    public Figure(Color color) {
        this.color = color;
    }
}
