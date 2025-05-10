package core.basesyntax;

public abstract class Figure implements AreaCalculator, Printable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}

