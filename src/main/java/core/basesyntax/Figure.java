package core.basesyntax;

public abstract class Figure implements Calculation, Drawable {
    private Color color;
    private double area;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
