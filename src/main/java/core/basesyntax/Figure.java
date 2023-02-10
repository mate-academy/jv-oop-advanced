package core.basesyntax;

public abstract class Figure implements AreaCalculator, Draw {
    public static final int MAX_VALUE = 50;
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
