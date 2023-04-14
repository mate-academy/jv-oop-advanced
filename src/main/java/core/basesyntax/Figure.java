package core.basesyntax;

public class Figure implements Area, Drawable {
    public Color color;

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
}
