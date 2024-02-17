package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    } //public Figure() {}

    public Color getColor() {
        return color;
    } //public abstract void draw();
}


