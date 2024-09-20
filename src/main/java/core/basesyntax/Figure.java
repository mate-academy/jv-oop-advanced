package core.basesyntax;

public abstract class Figure implements Drawable {
    protected Color color;
    protected double area;

    public Figure(Color color, double area) {
        this.color = color;
        this.area = area;
    }
}
