package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String shape;
    private Color color;

    public Figure() {
    }

    public Figure(String shape) {
        this.shape = shape;
    }

    public Figure(String shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
