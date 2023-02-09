package core.basesyntax;

abstract public class Figure implements AreaCalculator, Drawble {
    private Color color;

    public Figure(Color color) {
        this.setColor(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
