package core.basesyntax;

public class Figure implements AreaCalculator, Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
    }

    @Override
    public double getArea() {
        return 0;
    }
}
