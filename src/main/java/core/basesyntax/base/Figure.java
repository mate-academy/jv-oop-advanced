package core.basesyntax.base;

public abstract class Figure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
