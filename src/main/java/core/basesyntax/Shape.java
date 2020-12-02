package core.basesyntax;

public abstract class Shape {
    private final Color color = new ColorProducer().insertRandomColor();

    public Color getColorRandom() {
        return color;
    }

    public abstract double getSquare();

    public abstract Color getColor();
}
