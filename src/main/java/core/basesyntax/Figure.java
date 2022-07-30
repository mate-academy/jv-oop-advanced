package core.basesyntax;

public abstract class Figure implements CalculateArea, Draw {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Figure() {

    }

    public Color getColor() {
        return color;
    }
}
