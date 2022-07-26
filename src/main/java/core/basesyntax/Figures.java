package core.basesyntax;

abstract class Figures implements Figure {
    private Color color;

    public Figures(Color color) {
        this.color = color;
    }

    public abstract String draw();

    public Color getColor() {
        return color;
    }
}
