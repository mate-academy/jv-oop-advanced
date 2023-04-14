package core.basesyntax;

public class Figure implements Area, Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
    }

    public Color getColor() {
        return color;
    }
}
