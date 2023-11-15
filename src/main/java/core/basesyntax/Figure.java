package core.basesyntax;

public abstract class Figure implements Drawable {
    private static final double ROUND_NUMBER = 1000.0;
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    protected double round(double num) {
        return Math.round(num * ROUND_NUMBER) / ROUND_NUMBER;
    }
}
