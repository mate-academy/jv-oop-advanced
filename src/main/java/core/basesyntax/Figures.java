package core.basesyntax;

public abstract class Figures implements AreaCalculation, Draw {
    private final Color color;

    public Figures(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
