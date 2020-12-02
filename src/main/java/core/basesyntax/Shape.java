package core.basesyntax;

public abstract class Shape extends ColorProducer implements Figure {
    private final Color color = insertRandomColor();

    public Color getColor() {
        return color;
    }
}
