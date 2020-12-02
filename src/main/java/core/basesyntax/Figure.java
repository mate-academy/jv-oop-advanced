package core.basesyntax;

public abstract class Figure {

    protected double area;
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void setArea();

    public abstract void getInfo();
}
