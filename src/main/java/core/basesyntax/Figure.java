package core.basesyntax;

public abstract class Figure implements AreaCalculator, Draw {
    private Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.name().toLowerCase();
    }
}
