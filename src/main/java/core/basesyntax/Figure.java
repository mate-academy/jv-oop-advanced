package core.basesyntax;

public abstract class Figure implements AreaCalculation, Draw {
    private Color color;
    private float area;

    public Figure() {}

    public Figure(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }

}
