package core.basesyntax;

abstract class Figure {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double area();

    public abstract void draw();

}
