package core.basesyntax;

public abstract class Figure implements Printable,AreaCalculate {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
