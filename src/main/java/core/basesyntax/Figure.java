package core.basesyntax;

public abstract class Figure implements Drawable {
    protected Color color;

    public Figure() {

    }

    public Figure(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double getArea();

}
