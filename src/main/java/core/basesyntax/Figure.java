package core.basesyntax;

public abstract class Figure implements Area, PrintInfo {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    protected Figure() {
    }

    public Color getColor() {
        return color;
    }
}

