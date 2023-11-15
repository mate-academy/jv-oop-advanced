package core.basesyntax;

public abstract class Figure implements Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    protected double round(double num) {

        return Math.round(num * 1000.0) / 1000.0;
    }
}
