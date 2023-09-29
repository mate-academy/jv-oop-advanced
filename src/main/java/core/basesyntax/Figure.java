package core.basesyntax;

public class Figure implements Drawable, AreaCalculator {
    private Color color;

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
