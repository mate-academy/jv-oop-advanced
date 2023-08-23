package core.basesyntax;

public abstract class Figure extends FigureSupplier implements Drawable, AreaCalculation {
    private Color color;

    public Figure() {
    }

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
