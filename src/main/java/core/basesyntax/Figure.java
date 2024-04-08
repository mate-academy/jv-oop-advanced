package core.basesyntax;

abstract class Figure implements AreaCalculator, Drawable {
    protected Color color = Color.white;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
